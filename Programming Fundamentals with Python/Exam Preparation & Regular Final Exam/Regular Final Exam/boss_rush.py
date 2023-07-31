import re

def is_valid_input(input_string):
    name_pattern  = r"\|([A-Z]{4,})\|"
    title_pattern = r":#([A-Za-z]+\s[A-Za-z]+)#"

    name_match = re.search(name_pattern, input_string)
    title_match = re.search(title_pattern, input_string)

    if name_match and title_match:
        boss_name = name_match.group(1)
        boss_title = title_match.group(1)

        return boss_name, boss_title
    else:
        return None, None

n = int(input())
for _ in range(n):
    input_line = input()
    boss_name, boss_title = is_valid_input(input_line)

    if boss_name and boss_title:
        print(f"{boss_name}, The {boss_title}")
        print(f">> Strength: {len(boss_name)}")
        print(f">> Armor: {len(boss_title)}")
    else:
        print("Access denied!")
