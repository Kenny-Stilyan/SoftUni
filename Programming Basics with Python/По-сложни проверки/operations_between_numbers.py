
num1 = int(input())
num2 = int(input())
operator = input()

if num2 == 0:
    print(f"Cannot divide {num1} by zero")
    quit()
elif operator == "+":
    result = num1 + num2
elif operator == "-":
    result = num1 - num2
elif operator == "*":
    result = num1 * num2
elif operator == "/":
    result = num1 / num2
elif operator == "%":
    result = num1 % num2

even_or_odd = ""
if (operator == "+" or operator == "-" or operator == "*") and num2 != 0:
    if result % 2 == 0:
        even_or_odd = "even"
    else:
        even_or_odd = "odd"
    
    print(f"{num1} {operator} {num2} = {result} - {even_or_odd}")
elif operator == "/":
    print(f"{num1} {operator} {num2} = {result:.2f}")
elif operator == "%" and num2 != 0:
     print(f"{num1} {operator} {num2} = {result}")
