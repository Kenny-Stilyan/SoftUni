
phonebook_dict = {}
while True:
    string = input()
    if "-" not in string:
        if string.isnumeric():
            n = int(string)
        break

    token = string.split("-")
    key = token[0]
    val = token[1]
    phonebook_dict[key] = val

for i in range(n):
    name = input()

    if name in phonebook_dict.keys():
        print(f"{name} -> {phonebook_dict[name]}")
    else:
        print(f"Contact {name} does not exist.")
