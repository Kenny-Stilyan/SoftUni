
n = int(input())

for num in range(1, n+1):
    sum_digits = sum(int(digit) for digit in str(num))
    
    if sum_digits == 5 or sum_digits == 7 or sum_digits == 11:
        print(f"{num} -> True")
    else:
        print(f"{num} -> False")


"""
n = int(input())


for num in range(1, n+1, 1):
    digit = num
    sum_digits = 0
    
    while digit > 0:
        sum_digits += digit % 10
        digit = int(digit / 10)
    
    if sum_digits == 5 or sum_digits == 7 or sum_digits == 11:
        print(f"{num} -> True")
    else:
        print(f"{num} -> False")
"""
