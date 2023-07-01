
num = int(input())
list_of_digits = list(map(int, str(num)))

odd_list = []
even_list = []

for index in range(len(list_of_digits)):
    value = list_of_digits[index]
    if value % 2 == 0:
        even_list.append(value)
    if value % 2 != 0:
        odd_list.append(value)

sum_of_odd_digits = sum(odd_list)
sum_of_even_digits = sum(even_list)

print(f"Odd sum = {sum_of_odd_digits}, Even sum = {sum_of_even_digits}")
