
text = input()

while True:
    command, *args = input().split(":")
    if command == "Travel":
        print(f"Ready for world tour! Planned stops: {text}")
        break

    if command == "Add Stop":
        index, string = int(args[0]), args[1]
        if 0 <= index <= len(text):
            text = text[:index] + string + text[index:]
    elif command == "Remove Stop":
        start, end = int(args[0]), int(args[1])
        if 0 <= start < len(text) and 0 <= end < len(text):
            text = text[:start] + text[end+1:]
    elif command == "Switch":
        old_string, new_string = args[0], args[1]
        text = text.replace(old_string, new_string)

    print(text)
