
n = int(input())

academy_dict = {}
for _ in range(n):
    name = input()
    grade = float(input())

    if name not in academy_dict.keys():
        academy_dict[name] = []
    academy_dict[name].append(grade)

for student, grades in academy_dict.items():
    avg_grade = sum(grades) / len(grades)
    if avg_grade >= 4.50:
        print(f"{student} -> {avg_grade:.2f}")
