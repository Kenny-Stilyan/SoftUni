
sites_count = int(input())
salary = int(input())

fb_count = 0
ig_count = 0
rd_count = 0

for i in range(1, sites_count+1):
    site = input()
    if site == "Facebook":
        fb_count += 1
    elif site == "Instagram":
        ig_count += 1
    elif site == "Reddit":
        rd_count += 1

salary = salary - ((fb_count * 150)+(ig_count * 100)+(rd_count * 50))

if salary > 0:
    print(salary)
else:
    print("You have lost your salary.")

