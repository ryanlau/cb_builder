import os
from textwrap import wrap

import requests
from bs4 import BeautifulSoup

topic_url = "https://codingbat.com/java/String-1"
topic = topic_url.split("/")[-1].lower()

resp = requests.get(topic_url).text
soup = BeautifulSoup(resp, "html.parser")
q_table = soup.find_all("table")[2]

a_tags = q_table.find_all("a")
links = []

for a_tag in a_tags:
    links.append(a_tag.get("href"))

for link in links:
    resp = requests.get("https://codingbat.com" + link)
    soup = BeautifulSoup(resp.text, "html.parser")

    problem = soup.find_all(class_="h2")[3].text

    testcases = []
    table = soup.find_all("table")[2]
    for sibling in table.find("tr").find("td").next_element.next_sibling.next_siblings:
        if " →" in sibling:
            testcases.append(f'System.out.println({sibling.replace(" → ", "); // ")}')
    testcases = "\n        ".join(testcases)

    comments = wrap(soup.find(class_="max2").text, 73)
    comments = " * " + "\n     * ".join(comments)

    ace_line = soup.find("div", id="ace_div").text
    ace_line = ace_line.replace("public", "public static", 1)
    ace_line = ace_line.split("\n")[0]
    ace_line = ace_line[:-2]

    skele = """// {}

public class Main {{
    public static void main(String[] args) {{
        {}
    }}

    /**
    {}
     */
    {} {{
        
    }}
}}
""".format(
        resp.url, testcases, comments, ace_line
    )

    os.makedirs(f"{topic}/{problem}")

    with open(f"{topic}/{problem}/Main.java", mode="w") as file:
        file.write(skele)

    print(f"created {topic}/{problem}/Main.java")
