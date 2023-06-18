import sys

n = int(input())
max_num = -sys.maxsize
min_num = sys.maxsize

for i in range(n):
    current_number = int(input())
    if current_number > max_num:
        max_num = current_number
    if current_number < min_num:
        min_num = current_number

print(f"Max number: {max_num}")
print(f"Min number: {min_num}")
