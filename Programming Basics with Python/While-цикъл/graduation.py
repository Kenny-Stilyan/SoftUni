
name = input()

passing_grade = 4.0
sum_garde = 0.0
average_grade = 0.0

count_strikes = 0
count_grade = 0

while True:
    grade = float(input())
    count_grade += 1
    
    if grade < passing_grade:
        count_strikes += 1
        if count_strikes == 2:
            count_grade -= 1
            print(f"{name} has been excluded at {count_grade} grade")
            break
    else:
        sum_garde += grade
    
    if count_grade == 12:
        average_grade = sum_garde / count_grade
        print(f"{name} graduated. Average grade: {average_grade:.2f}")
        break
    