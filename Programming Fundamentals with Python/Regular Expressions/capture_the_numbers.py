import re

def extract_numbers_from_string(input_string):
    return re.findall(r'\d+', input_string)


extracted_numbers = []
while True:
    try:
        line = input() 
        if not line:
            break
        numbers = extract_numbers_from_string(line)
        extracted_numbers.extend(numbers)
    except EOFError:
        break

print(' '.join(extracted_numbers))

