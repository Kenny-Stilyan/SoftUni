
numbers = [int(num) for num in input().split()]

average_num = sum(numbers) / len(numbers)

count = 0
filterd_nums = []
for num in sorted(numbers, reverse=True):
    if num > average_num:
        filterd_nums.append(num)
        count += 1
    if count == 5:
        break

if filterd_nums:
    print(*filterd_nums)
else:
    print("No")
