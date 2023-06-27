
race = [int(i) for i in input().split(" ")]
finish = len(race) // 2

left_car = race[0:finish]
right_car = race[-1:finish:-1]

score_left_car = 0
score_right_car = 0

for score in left_car:
    score_left_car += score
    if score == 0:
        score_left_car *= 0.8

for score in right_car:
    score_right_car += score
    if score == 0:
        score_right_car *= 0.8

if score_left_car > score_right_car:
    print(f"The winner is right with total time: {score_right_car:.1f}")
else:
    print(f"The winner is left with total time: {score_left_car:.1f}")
