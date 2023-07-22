
command = input().split(" : ")

courses_dict = {}
while command[0] != "end":
    course_name, student = command[0], command[1]

    if course_name not in courses_dict.keys():
        courses_dict[course_name] = []

    courses_dict[course_name].append(student)
    command = input().split(" : ")

for course, students in courses_dict.items():
    print(f"{course}: {len(students)}")
    for student_name in students:
        print(f"-- {student_name}")

