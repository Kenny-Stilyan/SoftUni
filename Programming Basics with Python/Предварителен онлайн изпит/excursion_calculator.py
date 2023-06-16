
num_people = int(input())
season = input()


if season == "spring":
    if num_people <= 5:
        price = 50
        sum = num_people * price
    else:
        price = 48
        sum = num_people * price

elif season == "summer": # 15%
    if num_people <= 5:
        price = 48.50
        sum = num_people * price
        sum = sum - (sum * 0.15)
    else:
        price = 45
        sum = num_people * price
        sum = sum - (sum * 0.15)
elif season == "autumn":
    if num_people <= 5:
        price = 60
        sum = num_people * price
    else:
        price = 49.50
        sum = num_people * price
elif season == "winter": # 8%
    if num_people <= 5:
        price = 86
        sum = num_people * price
        sum = sum + (sum * 0.08)
    else:
        price = 85
        sum = num_people * price
        sum = sum + (sum * 0.08)

print(f"{sum:.2f} leva.")


