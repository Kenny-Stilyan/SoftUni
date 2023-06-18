
month = input()
overnight_stays = int(input())

if month == "May" or month == "October":
    studio = 50
    apartment = 65
    if 7 < overnight_stays < 14:
        studio *= 0.95
    elif overnight_stays > 14:
        studio *= 0.70
elif month == "June" or month == "September ":
    studio = 75.20
    apartment = 68.70
    if overnight_stays > 14:
        studio *= 0.80
elif month == "July" or month == "August":
    studio = 76
    apartment = 77


if overnight_stays > 14:
        apartment *= 0.90

studio_price = studio * overnight_stays
apartment_price = apartment * overnight_stays

print(f"Apartment: {apartment_price:.2f} lv.")
print(f"Studio: {studio_price:.2f} lv.")


