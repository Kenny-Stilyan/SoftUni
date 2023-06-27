
string = input().split(", ")
count_of_beggars = int(input())

money = [int(element) for element in string]
# ^^^
#for element in string:
#    money.append(int(element))

sum = []
index = 0
while index < count_of_beggars:
    sum_for_curr_beggar = 0

    for curr_index in range(index, len(money), count_of_beggars):
        sum_for_curr_beggar += money[curr_index]

    index += 1
    sum.append(sum_for_curr_beggar)

print(sum)


