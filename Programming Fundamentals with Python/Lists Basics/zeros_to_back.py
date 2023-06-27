
nums = input().split(", ")

list_num = [int(num) for num in nums]
for num in list_num:
    if num == 0:
        list_num.remove(num)
        list_num.append(num)

print(list_num)


