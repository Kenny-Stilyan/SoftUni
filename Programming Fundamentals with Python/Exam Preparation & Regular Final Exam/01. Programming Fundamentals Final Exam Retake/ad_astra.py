import re

def extract_food_info(input_str):
    pattern = r"([|])(?P<name>[A-Za-z\s]+?)\1(?P<expiration>\d{2}/\d{2}/\d{2})\1(?P<calories>\d{1,5})\1|([#])(?P<name2>[A-Za-z\s]+?)\5(?P<expiration2>\d{2}/\d{2}/\d{2})\5(?P<calories2>\d{1,5})\5"
    matches = re.finditer(pattern, input_str)
    return matches

def calculate_days_remaining():
    total_calories = 0
    for match in food_items:
        if match.group('name'):
            calories = int(match.group('calories'))
        else:
            calories = int(match.group('calories2'))
        total_calories += calories
    return total_calories // 2000


str_input = input()
food_items = list(extract_food_info(str_input))

if not food_items:
    print("You have food to last you for: 0 days!")
else:
    print(f"You have food to last you for: {calculate_days_remaining()} days!")
    for match in food_items:
        if match.group('name'):
            item = match.group('name').strip()
            expiration = match.group('expiration')
            calories = int(match.group('calories'))
        else:
            item = match.group('name2').strip()
            expiration = match.group('expiration2')
            calories = int(match.group('calories2'))

        print(f"Item: {item}, Best before: {expiration}, Nutrition: {calories}")





