
product = input()
day = input()
quantity = float(input())

total_price = 0
if day == "Monday" \
    or day == "Tuesday" \
    or day == "Wednesday" \
    or day == "Thursday" \
    or day == "Friday":
    if product == "banana":
        total_price = quantity * 2.50
    elif product == "apple":
        total_price = quantity * 1.20
    elif product == "orange":
        total_price = quantity * 0.85
    elif product == "grapefruit":
        total_price = quantity * 1.45
    elif product == "kiwi":
        total_price = quantity * 2.70
    elif product == "pineapple":
        total_price = quantity * 5.50
    elif product == "grapes":
        total_price = quantity * 3.85
    else:
        print("error")
elif day == "Saturday" \
    or day == "Sunday":
    if product == "banana":
        total_price = quantity * 2.70
    elif product == "apple":
        total_price = quantity * 1.25
    elif product == "orange":
        total_price = quantity * 0.90
    elif product == "grapefruit":
        total_price = quantity * 1.60
    elif product == "kiwi":
        total_price = quantity * 3.00
    elif product == "pineapple":
        total_price = quantity * 5.60
    elif product == "grapes":
        total_price = quantity * 4.20
    else:
        print("error")
else:
    print("error")

if total_price != 0:
    print(f"{total_price:.2f}")



