
string = input().split()
n = int(input())

list_num = []
for index in string:
    num = int(index)
    list_num.append(num)

for i in range(n):
    list_num.remove(min(list_num))

print(*list_num, sep=", ")

