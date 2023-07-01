import math

def factorial_division(num1, num2):
    factorial_num1 = math.factorial(num1)
    factorial_num2 = math.factorial(num2)
    return factorial_num1 / factorial_num2


num1 = int(input())
num2 = int(input())

result = factorial_division(num1, num2)
print(f"{result:.2f}")

