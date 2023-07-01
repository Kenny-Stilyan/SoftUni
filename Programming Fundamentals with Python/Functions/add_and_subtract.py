
def sum_numbers(num1, num2):
    return num1 + num2

def subtract(sum, num3):
    return sum - num3


num1 = int(input())
num2 = int(input())
num3 = int(input())

sum = sum_numbers(num1, num2)
result = subtract(sum, num3)
print(result)
