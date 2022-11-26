
flower_type = input()
number_of_flowers = int(input())
budget = int(input())

roses_price = 5
dahlias_price = 3.80
tulips_price = 2.80
narcissus_price = 3
gladiolus_price = 2.50

discounted_price = 0

if flower_type == "Roses":
    total_flower_price = number_of_flowers * roses_price
    if number_of_flowers >= 80:
        discount = total_flower_price * 0.1
        discounted_price = total_flower_price - discount
elif flower_type == "Dahlias":
    total_flower_price = number_of_flowers * dahlias_price
    if number_of_flowers >= 90:
        discount = total_flower_price * 0.15
        discounted_price = total_flower_price - discount
elif flower_type == "Tulips":
    total_flower_price = number_of_flowers * tulips_price
    if number_of_flowers >= 80:
        discount = total_flower_price * 0.15
        discounted_price = total_flower_price - discount
elif flower_type == "Narcissus":
    total_flower_price = number_of_flowers * narcissus_price
    if number_of_flowers < 120:
        discount = total_flower_price * 0.15
        discounted_price = total_flower_price + discount
elif flower_type == "Gladiolus":
    total_flower_price = number_of_flowers * gladiolus_price
    if number_of_flowers < 80:
        discount = total_flower_price * 0.20
        discounted_price = total_flower_price + discount

if discounted_price != 0:
    if discounted_price > budget:
        needed_money = abs(budget - discounted_price)
        print(f"Not enough money, you need {needed_money:.2f} leva more.")
    elif discounted_price <= budget:
        left_money = abs(budget - discounted_price)
        print(f"Hey, you have a great garden with {number_of_flowers} {flower_type} and {left_money:.2f} leva left.")
else:
    if total_flower_price > budget:
        needed_money = abs(budget - total_flower_price)
        print(f"Not enough money, you need {needed_money:.2f} leva more.")
    elif total_flower_price <= budget:
        left_money = abs(budget - total_flower_price)
        print(f"Hey, you have a great garden with {number_of_flowers} {flower_type} and {left_money:.2f} leva left.")


"""
type_flower = input()
count_flowers = int(input())
budget = int(input())
 
expenses = 0
if type_flower == "Roses":
    expenses = 5 * count_flowers
    if count_flowers > 80:
        expenses = expenses * 0.90
elif type_flower == "Dahlias":
    expenses = 3.80 * count_flowers
    if count_flowers > 90:
        expenses = expenses * 0.85
elif type_flower == "Tulips":
    expenses = 2.80 * count_flowers
    if count_flowers > 80:
        expenses = expenses * 0.85
elif type_flower == "Narcissus":
    expenses = 3 * count_flowers
    if count_flowers < 120:
        expenses = expenses * 1.15
elif type_flower == "Gladiolus":
    expenses = 2.50 * count_flowers
    if count_flowers < 80:
        expenses = expenses * 1.20
 
diff = abs(budget - expenses)
if budget >= expenses:
    print(f"Hey, you have a great garden with {count_flowers} {type_flower} and {diff:.2f} leva left.")
else:
    print(f"Not enough money, you need {diff:.2f} leva more.")
"""




