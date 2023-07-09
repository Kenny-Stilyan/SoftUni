
def extract_message(string):
    numbers = []
    non_numbers = []

    for char in string:
        if char.isdigit():
            numbers.append(int(char))
        else:
            non_numbers.append(char)

    take_list = [numbers[i] for i in range(len(numbers)) if i % 2 == 0]
    skip_list = [numbers[i] for i in range(len(numbers)) if i % 2 != 0]

    result = ""
    skip_count = 0

    for take, skip in zip(take_list, skip_list):
        result += "".join(non_numbers[:take])
        non_numbers = non_numbers[take+skip:]
        skip_count += skip

    result += "".join(non_numbers[skip_count:])

    return result


string = input()
result = extract_message(string)
print(result)
