quantity = int(input())
days_left = int(input())

ornament_price = 2
skirt_price = 5
garland_price = 3
lights_price = 15

price = 0
spirit = 0

for curr_day in range(1, days_left + 1):
    if curr_day % 11 == 0:
        quantity += 2

    if curr_day % 2 == 0:
        price += quantity * ornament_price
        spirit += 5
    if curr_day % 3 == 0:
        price += (skirt_price + garland_price) * quantity
        spirit += 13
    if curr_day % 5 == 0:
        price += quantity * lights_price
        spirit += 17
        if curr_day % 3 == 0:
            spirit += 30

    if curr_day % 10 == 0:
        spirit -= 20
        price += skirt_price + garland_price + lights_price

        if curr_day == days_left:
            spirit -= 30

print(f"Total cost: {price}")
print(f"Total spirit: {spirit}")
