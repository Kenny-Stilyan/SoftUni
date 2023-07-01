
def calculate(operator, num1, num2) -> int:
    if operator == "add":
        return num1 + num2
    elif operator == "subtract":
        return num1 - num2
    elif operator == "multiply":
        return num1 * num2
    elif operator == "divide":
        return num1 / num2
    else:
        result = None
    return result


operator = input()
num1 = int(input())
num2 = int(input())

result = calculate(operator, num1, num2)
print(f"{result:.0f}")

