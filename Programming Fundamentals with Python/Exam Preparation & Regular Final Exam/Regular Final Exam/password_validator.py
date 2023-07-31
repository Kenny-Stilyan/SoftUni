import re

def make_upper(password, index):
    if 0 <= index < len(password):
        password = password[:index] + password[index].upper() + password[index+1:]
        print(password)
    return password

def make_lower(password, index):
    if 0 <= index < len(password):
        password = password[:index] + password[index].lower() + password[index+1:]
        print(password)
    return password

def insert_char(password, index, char):
    if 0 <= index <= len(password):
        password = password[:index] + char + password[index:]
        print(password)
    return password

def replace_char(password, char, value):
    if char in password:
        ascii_value = ord(char)
        new_char = chr(ascii_value + value)
        password = password.replace(char, new_char)
        print(password)
    return password

def validate_password(password):
    if len(password) < 8:
        print("Password must be at least 8 characters long!")
    if not re.match(r"^[a-zA-Z0-9_]+$", password):
        print("Password must consist only of letters, digits and _!")
    if not any(c.isupper() for c in password):
        print("Password must consist at least one uppercase letter!")
    if not any(c.islower() for c in password):
        print("Password must consist at least one lowercase letter!")
    if not any(c.isdigit() for c in password):
        print("Password must consist at least one digit!")



password = input()

while True:
    command = input()
    if command == "Complete":
        break

    action, *args = command.split()

    if action == "Make":
        case, index = args[0], int(args[1])
        if case == "Upper":
            password = make_upper(password, index)
        elif case == "Lower":
            password = make_lower(password, index)
    elif action == "Insert":
        index, char = int(args[0]), args[1]
        password = insert_char(password, index, char)
    elif action == "Replace":
        char, value = args[0], int(args[1])
        password = replace_char(password, char, value)
    elif action == "Validation":
        validate_password(password)



