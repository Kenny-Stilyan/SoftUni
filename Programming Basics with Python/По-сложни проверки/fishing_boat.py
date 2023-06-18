
budget = int(input())
season = input()
people = int(input())

if season == "Spring":
    boat_price = 3000
    if people <= 6:
        discount = boat_price * 0.90
    elif 7 <= people <= 11:
        discount = boat_price * 0.85
    elif people >= 12:
        discount = boat_price * 0.75
elif season == "Summer" or season == "Autumn":
    boat_price = 4200
    if people <= 6:
        discount = boat_price * 0.90
    elif 7 <= people <= 11:
        discount = boat_price * 0.85
    elif people >= 12:
        discount = boat_price * 0.75
elif season == "Winter":
    boat_price = 2600
    if people <= 6:
        discount = boat_price * 0.90
    elif 7 <= people <= 11:
        discount = boat_price * 0.85
    elif people >= 12:
        discount = boat_price * 0.75


if people % 2 == 0 and season != "Autumn":
    discount *= 0.95
else:
    pass


if budget <= discount:
    needed_money = abs(budget - discount)
    print(f"Not enough money! You need {needed_money:.2f} leva.")
else:
    left_money = abs(budget - discount)
    print(f"Yes! You have {left_money:.2f} leva left.")
