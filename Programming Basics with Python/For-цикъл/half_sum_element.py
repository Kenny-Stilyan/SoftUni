import sys

num_input = int(input())

max_num = -sys.maxsize
num_sum = 0

for i in range(0, num_input):
    num = int(input())
    if num > max_num:
        max_num = num

    num_sum += num

if max_num == num_sum - max_num:
    print(f"Yes\nSum = {max_num}")
else:
    num_sum -= max_num
    diff = abs(max_num - num_sum)
    print(f"No\nDiff = {diff}")




