
budget = float(input())
the_extras = int(input())
clothing = float(input())

decor_price = budget * 0.10
clothing_price = the_extras * clothing 

if the_extras > 150:
    clothing_price_discounted = clothing_price * 0.10
    clothing_price -= clothing_price_discounted

tax = decor_price + clothing_price
total = abs(budget - tax)

if budget >= tax:
    print("Action!")
    print(f"Wingard starts filming with {total:.2f} leva left.")
else:
    print("Not enough money!")
    print(f"Wingard needs {total:.2f} leva more.")




