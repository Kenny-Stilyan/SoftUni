
hours = int(input())
min = int(input())

min += 15
if min >= 60:
    hours += 1
    min -= 60

if hours > 23:
    hours -= 24

if min < 10:
    print(f"{hours}:0{min}")
else:
    print(f"{hours}:{min}")
    





