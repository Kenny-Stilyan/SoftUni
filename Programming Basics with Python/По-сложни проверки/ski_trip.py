
days_staying = int(input())
type_accommodation = input()
grade = input()

overnight_stays = days_staying - 1

if type_accommodation == "room for one person":
    overnight_stays_price = overnight_stays * 18
elif type_accommodation == "apartment":
    overnight_stays_price = overnight_stays * 25
    if days_staying < 10:
        overnight_stays_price *= 0.70
    elif days_staying < 15:
        overnight_stays_price *= 0.65
    else:
        overnight_stays_price *= 0.50
elif type_accommodation == "president apartment":
    overnight_stays_price = overnight_stays * 35
    if days_staying < 10:
        overnight_stays_price *= 0.90
    elif days_staying < 15:
        overnight_stays_price *= 0.85
    else:
        overnight_stays_price *= 0.80

if grade == "positive":
   overnight_stays_price *= 1.25
elif grade == "negative":
    overnight_stays_price *= 0.90

print(f"{overnight_stays_price:.2f}")
