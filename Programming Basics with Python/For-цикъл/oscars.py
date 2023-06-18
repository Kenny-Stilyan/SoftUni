
actor = input()
points = float(input())
judges = int(input())

total_points = points
for i in range(1, judges+1):
    judge_name = input()
    judge_points = float(input())

    current_points = len(judge_name)* judge_points / 2
    total_points += current_points

    if total_points >= 1250.5:
        break

if total_points >= 1250.5:
    print(f"Congratulations, {actor} got a nominee for leading role with {total_points:.1f}!")
else:
    diff_points = 1250.5 - total_points
    print(f"Sorry, {actor} you need {diff_points:.1f} more!")



