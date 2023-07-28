import re

nums = input()
pattern = r"(?:(?<=\s)|^)(-?\d+(\.\d+)?)(?=\s|$)"

matches = re.findall(pattern, nums)

for match in matches:
    print(match[0], end=" ")

