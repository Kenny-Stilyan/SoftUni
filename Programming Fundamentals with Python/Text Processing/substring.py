
removing_str = input()
text = input()

while removing_str in text:
    text = text.replace(removing_str, '')

print(text)
