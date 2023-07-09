
group_size = int(input()) 
days = int(input())

coins = 0
for curr_day in range(1, days+1):
    coins += 50

    if curr_day % 10 == 0:
        group_size -= 2
    if curr_day % 15 == 0:
        group_size += 5
    if curr_day % 3 == 0:
        coins -= 3 * group_size
    if curr_day % 5 == 0:
        coins += 20 * group_size
        if curr_day % 3 == 0:
            coins -= 2 *group_size

    coins -= 2 * group_size

coins_per_person = coins // group_size
print(f"{group_size} companions received {coins_per_person} coins each.")




