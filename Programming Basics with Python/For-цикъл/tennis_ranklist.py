import math

tournaments_num = int(input())
starting_points = int(input())

win_points = 0
win_count = 0
for i in range(1, tournaments_num+1):
    stage = input()

    if stage == "W":
        win_count += 1
        win_points += 2000
    elif stage == "F":
        win_points += 1200
    elif stage == "SF":
        win_points += 720

sum_points = starting_points + win_points
print(f"Final points: {sum_points}")

avrege_points = math.floor(win_points / tournaments_num)
print(f"Average points: {avrege_points}")

win_percent = (win_count/tournaments_num)* 100
print(f"{win_percent:.2f}%")
