import os
import sys
from textwrap import wrap

import requests
from bs4 import BeautifulSoup


if len(sys.argv) == 1:
    topic_url = "https://codingbat.com/python/Warmup-1"
else:
    topic_url = f"https://codingbat.com/python/{sys.argv[1]}"

topic = topic_url.split("/")[-1].lower()

def reformat_method_call(method_call_str):
    method_name = method_call_str[: method_call_str.find("(")]
    method_params_string = method_call_str[
        method_call_str.find("(") + 1 : method_call_str.rfind(" → ") - 1
    ]
    expected_output = method_call_str[method_call_str.rfind(" → ") + 3 :]

    method_call = f"{method_name}({method_params_string})) # {expected_output}"

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
    for method_call in (
        table.find("tr").find("td").next_element.next_sibling.next_siblings
    ):
        if " →" in method_call:
            testcases.append(f"print({reformat_method_call(method_call)}")
    testcases = "\n".join(testcases)

    comments = wrap(soup.find(class_="max2").text, 80)
    comments = "\n".join(comments)

    ace_line = soup.find("div", id="ace_div").text
    ace_line = ace_line.strip()

    skele = """# {}

\"\"\"
{}
\"\"\"
{}
    

# test cases: do not edit
{}

""".format(
        resp.url, comments, ace_line, testcases
    )


    try:
        os.makedirs(f"{topic}")
    except:
        pass

    with open(f"{topic}/{problem}.py", mode="w") as file:
        file.write(skele)

    print(f"created {topic}/{problem}.py")
