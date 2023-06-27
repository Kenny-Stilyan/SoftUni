
numbers = input().split()
text = input().strip()
message = ""

for number in numbers:
    index = sum(int(digit) for digit in number)
    if index >= len(text):
        index %= len(text)
    char = text[index]
    text = text[:index] + text[index+1:]
    message += char

print(message)
