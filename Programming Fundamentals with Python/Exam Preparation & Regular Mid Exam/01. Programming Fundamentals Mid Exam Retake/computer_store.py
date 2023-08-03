
total_without_taxes = 0
while True:
    string_input = input()
    if string_input == "special":
        taxes_amount = total_without_taxes * 0.2
        total_with_taxes = (total_without_taxes + taxes_amount) * 0.9
        break
    if string_input == "regular":
        taxes_amount = total_without_taxes * 0.2
        total_with_taxes = total_without_taxes + taxes_amount
        break

    price_input = float(string_input)

    if price_input < 0:
        print("Invalid price!")
        continue
    else:
        total_without_taxes += price_input

if total_without_taxes == 0:
    print("Invalid order!")
else:
    print(f"Congratulations you've just bought a new computer!")
    print(f"Price without taxes: {total_without_taxes:.2f}$")
    print(f"Taxes: {taxes_amount:.2f}$")
    print(f"-----------")
    print(f"Total price: {total_with_taxes:.2f}$")

