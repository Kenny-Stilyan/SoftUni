
string = input().split()

bakery_dict = {}
for i in range(0, len(string), 2):
    food = string[i]
    quantities = int(string[i+1])
    bakery_dict[food] = quantities

print(bakery_dict)
