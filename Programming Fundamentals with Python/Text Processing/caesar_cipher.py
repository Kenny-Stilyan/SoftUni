
def caesar_cipher(text):
    meassage = ""
    for char in text:
        new_char = chr(ord(char) +3)
        meassage += new_char

    return meassage


text = input()

result = caesar_cipher(text)
print(result)

