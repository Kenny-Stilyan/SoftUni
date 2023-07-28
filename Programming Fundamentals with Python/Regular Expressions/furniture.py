import re

furniture_data = {}
while True:
    line = input().strip()
    if line == "Purchase":
        break

    pattern = r">>{1}(?P<name>[A-Za-z]+)<<{1}(?P<price>\d+(\.\d+)?)!{1}(?P<quantity>\d+)"
    match = re.match(pattern, line)

    if match:
        name = match.group('name')
        price = float(match.group('price'))
        quantity = int(match.group('quantity'))

    if name not in furniture_data:
        furniture_data[name] = 0
        furniture_data[name] += price * quantity

print("Bought furniture:")
for name, total_cost in furniture_data.items():
    print(name)
print(f"Total money spend: {sum(furniture_data.values()):.2f}")
