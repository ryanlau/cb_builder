import os
from textwrap import wrap

import requests
from bs4 import BeautifulSoup

from queue import LifoQueue

topic_url = "https://codingbat.com/java/Array-2"
topic = topic_url.split("/")[-1].lower()

def reformat_method_call(method_call_str):
    method_name = method_call_str[:method_call_str.find("(")]
    method_params_string = method_call_str[method_call_str.find("(") + 1:method_call_str.rfind(" → ") - 1]
    expected_output = method_call_str[method_call_str.rfind(" → ") + 3:]

    stack = LifoQueue()

    params = []

    method_param = "new int[] {"

    for character in method_params_string:
        if character == "[":
            stack.put(character)

        elif character == "]":
            stack.get()
            if stack.empty():
                method_param += "}"
                params.append(method_param)
                method_param = "new int[] {"

        else:
            if not stack.empty():
                method_param += character

    method_call = f"{method_name}({', '.join(params)})); // {expected_output}"

    return method_call


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
    for method_call in table.find("tr").find("td").next_element.next_sibling.next_siblings:
        if " →" in method_call:
            testcases.append(f'System.out.println({reformat_method_call(method_call)}')
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

