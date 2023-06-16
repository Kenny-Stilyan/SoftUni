
text = input().lower()

find_list = ["sand", "water", "fish", "sun"]
count = 0

for item in find_list:
    if item in text:
        count += text.count(item)

print(count)

