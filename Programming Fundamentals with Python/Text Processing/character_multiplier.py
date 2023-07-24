
str1, str2 = input().split()

total = 0
for char1, char2 in zip(str1, str2):
    total += ord(char1) * ord(char2)

remaining_chars = abs(len(str1) - len(str2))
# If one string is longer than the other, add the remaining character codes to the total sum without multiplication
if remaining_chars > 0:
    if len(str1) > len(str2):
        total += sum(ord(char) for char in str1[-remaining_chars:])
    else:
        total += sum(ord(char) for char in str2[-remaining_chars:])

print(total)
