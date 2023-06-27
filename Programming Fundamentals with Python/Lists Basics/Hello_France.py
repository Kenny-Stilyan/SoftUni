
items = input().split("|")
budget = float(input())

ticket = 150
profit = 0
list_prices = []

for item in items:
    type, price_str = item.split("->")
    price = float(price_str)

    valid_price = False
    if type == "Clothes":
        if price <= 50:
            valid_price = True
    elif type == "Shoes":
        if price <= 35:
            valid_price = True
    elif type == "Accessories":
        if price <= 20.50:
            valid_price = True

    if valid_price:
        if budget >= price:
            budget -= price
            selling_price = price * 1.4
            profit += selling_price - price
            list_prices.append(selling_price)

print(" ".join([f"{selling_price:.2f}" for selling_price in list_prices]))
# ^^^
#for selling_price in list_prices:
#    print(f"{selling_price:.2f}", end=" ")

print(f"Profit: {profit:.2f}")

total = budget + sum(list_prices)
if total >= ticket:
    print("Hello, France!")
else:
    print("Not enough money.")
