budget = float(input())
students = int(input())
flour_price = float(input())
egg_price = float(input())
apron_price = float(input())

aprons_needed = round(students * 1.2 + 1)
free_flour_packages = students // 5
flour_needed = students - free_flour_packages
total_cost = (flour_needed * flour_price) + (students * 10 * egg_price) + (aprons_needed * apron_price)

if total_cost <= budget:
    print(f"Items purchased for {total_cost:.2f}$.")
else:
    needed_money = total_cost - budget
    print(f"{needed_money:.2f}$ more needed.")
