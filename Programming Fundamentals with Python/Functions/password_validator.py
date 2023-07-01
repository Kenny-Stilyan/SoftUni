
def is_long(pass_input):
    if 6 <= len(pass_input) <= 10:
        return True
    else:
        print("Password must be between 6 and 10 characters")

def is_letters_digits(pass_input):
    for char in pass_input:
        if not char.isalnum():
            print("Password must consist only of letters and digits")
            return False
    return True

def have_digits(pass_input):
    digit_count = sum(1 for char in pass_input if char.isdigit())
    if digit_count >= 2:
        return True
    else:
        print("Password must have at least 2 digits")
        return False

def validate_password(pass_input):
    if is_long(pass_input) and is_letters_digits(pass_input) and have_digits(pass_input):
        print("Password is valid")


pass_input = input()
validate_password(pass_input)
