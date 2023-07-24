
def replace_repeating_chars(text):
    new_text = text[0]
    for index in range(1, len(text)):
        if text[index] != text[index-1]:
            new_text += text[index]

    return new_text


text = input()

result = replace_repeating_chars(text)
print(result)

