
message = input()

while True:
    print_it = True
    instruction = input()
    if instruction == "Reveal":
        print(f"You have a new text message: {message}")
        break

    command, *args = instruction.split(":|:")

    if command == "InsertSpace":
        index = int(args[0])
        message = message[:index] + " " + message[index:]
    elif command == "Reverse":
        substring = args[0]
        if substring in message:
            message = message.replace(substring, "", 1)
            message += substring[::-1]
        else:
            print_it = False
            print("error")
    elif command == "ChangeAll":
        substring, replacement = args[0], args[1]
        message = message.replace(substring, replacement)

    if print_it:
        print(message)

