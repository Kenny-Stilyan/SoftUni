from math import ceil

days = int(input())
km = float(input())

sum_km = 0 + km
for i in range(days):
    procent = int(input())
    km = km + (km * (procent/100))
    sum_km += km

if sum_km >= 1000:
    difference = ceil(sum_km - 1000)
    print(f"You've done a great job running {difference} more kilometers!")
else:
    difference = ceil(abs(sum_km - 1000))
    print(f"Sorry Mrs. Ivanova, you need to run {difference} more kilometers")



