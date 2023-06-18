
move_by = int(input())
index = int(input())

result = ""
for i in range(index):
    char = ord(input())
    new_char = char + move_by
    decrypted_letter = chr(new_char)
    result += decrypted_letter
print(result)
