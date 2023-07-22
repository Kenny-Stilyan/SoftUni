
string = input().split(", ")

characters = {}

for char in string:
    characters[char] = ord(char)

print(characters)


