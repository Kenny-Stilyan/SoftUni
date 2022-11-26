
budget = float(input())
season = input()

destination = ""
vacation_place = ""
if season == "summer":
    vacation_place = "Camp"
    if budget <= 100:
        destination = "Bulgaria"
        spend = budget * 0.70
        spend_money = budget - spend
    elif budget <= 1000:
        destination = "Balkans"
        spend = budget * 0.60
        spend_money = budget - spend
    else:
        vacation_place = "Hotel"
        destination = "Europe"
        spend = budget * 0.10
        spend_money = budget - spend
elif season == "winter":
    vacation_place = "Hotel"
    if budget <= 100:
        destination = "Bulgaria"
        spend = budget * 0.30
        spend_money = budget - spend
    elif budget <= 1000:
        destination = "Balkans"
        spend = budget * 0.20
        spend_money = budget - spend
    else:
        vacation_place = "Hotel"
        destination = "Europe"
        spend = budget * 0.10
        spend_money = budget - spend

print(f"Somewhere in {destination}")
print(f"{vacation_place} - {spend_money:.2f}")









