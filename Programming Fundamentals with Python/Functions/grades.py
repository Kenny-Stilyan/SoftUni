
def receive_grade(input_grade) -> float:
    if 2.00 <= input_grade <= 2.99:
        return "Fail"
    elif 3.00 <= input_grade <= 3.49:
        return "Poor"
    elif 3.50 <= input_grade <= 4.49:
        return "Good"
    elif 4.50 <= input_grade <= 5.49:
        return "Very Good"
    elif 5.50 <= input_grade <= 6.00:
        return "Excellent"


input_grade = float(input())

result = receive_grade(input_grade)
print(result)
