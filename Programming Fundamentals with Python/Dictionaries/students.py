
students = []
search = ""

while True:
    command = input()

    if ":" not in command:
        search = command.replace("_", " ")
        break

    name, ID, course = command.split(":")
    students.append({"name": name, "ID": ID, "course": course})

for student in students:
    if student["course"] == search:
        print(f"{student['name']} - {student['ID']}")

