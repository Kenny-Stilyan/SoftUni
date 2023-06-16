
budget = float(input())
flour_price = float(input())
egg_price = flour_price * 0.75
milk_price = (flour_price * 1.25) / 4

loaves = 0
eggs = 0

while budget >= (flour_price + egg_price + milk_price):
    budget -= (flour_price + egg_price + milk_price)
    loaves += 1
    eggs += 3

    if loaves % 3 == 0:
        eggs -= (loaves - 2)

money_left = "{:.2f}".format(budget)
print(f"You made {loaves} loaves of Easter bread! Now you have {eggs} eggs and {money_left}BGN left.")

