
str_input = input()

sum_prime = 0
sum_not_prime = 0
while str_input != "stop":
    num = int(str_input)

    if num < 0:
        print("Number is negative.")
        str_input = input()
        continue

    count = 0
    for i in range(1, num + 1):
        if num % i == 0:
            count += 1
    if count == 2:
        sum_prime += num
    else:
        sum_not_prime += num

    str_input= input()

print(f"Sum of all prime numbers is: {sum_prime}")
print(f"Sum of all non prime numbers is: {sum_not_prime}")



