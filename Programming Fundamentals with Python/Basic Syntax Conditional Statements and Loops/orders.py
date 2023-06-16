n = int(input())

total_price = 0
for i in range(n):
    price_per_capsule = float(input())
    days = int(input())
    capsules = int(input())

    if not (0.01 <= price_per_capsule <= 100) or not (1 <= days <= 31) or not (1 <= capsules <= 2000):
        continue

    price = price_per_capsule * days * capsules
    total_price += price

    print(f"The price for the coffee is: ${price:.2f}")

print(f"Total: ${total_price:.2f}")
