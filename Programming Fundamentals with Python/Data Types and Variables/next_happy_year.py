
year = int(input())

while True:
    year += 1
    str_year = str(year)
    if len(set(str_year)) == len(str_year):
        break

print(year)
