import re

def is_valid_username(username):
    # Check the length of the username
    if not 3 <= len(username) <= 16:
        return False

    # Check if the username contains only letters, numbers, hyphens, and underscores
    if not re.match(r"^[a-zA-Z0-9_-]+$", username):
        return False

    # Check if there are no redundant symbols before, after, or in between
    if re.search(r"__|-_|_-|__|-$|^-", username):
        return False

    return True


usernames = [username.strip() for username in input().split(", ")]
valid_usernames = [username for username in usernames if is_valid_username(username)]

for valid_user in valid_usernames:
    print(valid_user)

