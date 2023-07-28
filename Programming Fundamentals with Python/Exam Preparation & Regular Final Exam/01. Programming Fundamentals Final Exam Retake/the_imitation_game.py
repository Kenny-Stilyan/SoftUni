
encrypted_message = input()

while True:
    commands = input()
    if commands == "Decode":
        break

    command, *args = commands.split("|")
    if command == "Move":
        n = int(args[0])
        encrypted_message = encrypted_message[n:] + encrypted_message[:n]
    elif command == "Insert":
        index, value = int(args[0]), args[1]
        encrypted_message = encrypted_message[:index] + value + encrypted_message[index:]
    elif command == "ChangeAll":
        substring, replacement = args[0], args[1]
        encrypted_message = encrypted_message.replace(substring, replacement)

print(f"The decrypted message is: {encrypted_message}")
