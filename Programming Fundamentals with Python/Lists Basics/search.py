
n = int(input())
word = input()

list = []
filter_list = []
for _ in range(n):
    strings = input()
    list.append(strings)

for i in range(len(list)):
    if word in list[i]:
        filter_list.append(list[i])

print(list)
print(filter_list)




