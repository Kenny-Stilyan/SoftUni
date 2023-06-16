
n = int(input())
presentation_name = input()

count_grades = 0
sum_all_grades = 0
while presentation_name != "Finish":
    current_sum_grades = 0
    for i in range(1, n+1):
        grade = float(input())
        count_grades += 1
        sum_all_grades += grade
        current_sum_grades += grade

    avg_of_current = current_sum_grades / n
    print(f"{presentation_name} - {avg_of_current:.2f}.")

    presentation_name = input()

avg_result = sum_all_grades / count_grades
print(f"Student's final assessment is {avg_result:.2f}.")


