import re

text = input()
variable_names = []
pattern = r"\b_{1}([A-Za-z0-9]+)\b"

matches = re.findall(pattern, text)
variable_names.extend(matches)

print(','.join(variable_names))
