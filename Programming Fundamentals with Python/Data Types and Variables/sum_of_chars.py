
n = int(input())

total_sum = 0
for i in range(n):
    char = input()
    ascii_code = ord(char)
    total_sum += ascii_code

print(f"The sum equals: {total_sum}")
