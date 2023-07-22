
country = input().split(", ")
capital = input().split(", ")

zipped = dict(zip(country, capital))
for country, capital in zipped.items():
    print(f"{country} -> {capital}")

