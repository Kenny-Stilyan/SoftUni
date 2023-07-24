
def find_name_age_indexes(text):
    name_start = text.find("@") +1
    name_end = text.find("|")

    age_start = text.find("#") +1
    age_end = text.find("*")

    name = text[name_start:name_end]
    age = text[age_start:age_end]

    return name, age


n = int(input())
for _ in range(n):
    text = input()

    name, age = find_name_age_indexes(text)
    print(f"{name} is {age} years old.")

