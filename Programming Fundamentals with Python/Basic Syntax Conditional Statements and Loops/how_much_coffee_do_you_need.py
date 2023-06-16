
command = input()

points = 0
while command != "END":
    if command.isupper() == True:
        points += 2
    if command.islower() == True:
        points += 1

if points > 5:
    print(f"You need extra sleep")
else:
    print(points)

