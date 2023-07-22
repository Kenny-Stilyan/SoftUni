
dictionary = {}
while True:
    command = input()

    if command == "statistics":
        break

    tokens = command.split(": ")
    key = tokens[0]
    val = int(tokens[1])

    if key in dictionary:
        dictionary[key] += val
    else:
        dictionary[key] = val

print("Products in stock:")
for key, val in dictionary.items():
    print(f"- {key}: {val}")

print(f"Total Products: {len(dictionary)}")
print(f"Total Quantity: {sum(dictionary.values())}")


