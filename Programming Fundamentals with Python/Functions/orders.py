
def total_price(product, quantity):
    if product == "coffee":
        return quantity * 1.50
    elif product == "water":
        return quantity * 1
    elif product == "coke":
        return  quantity * 1.40
    elif product == "snacks":
        return  quantity * 2


product = input()
quantity = int(input())

result = total_price(product, quantity)
print(f"{result:.2f}")
