
string = input().split()
search = input().split()

stock_dict = {}
for i in range(0, len(string), 2):
    food = string[i]
    quantities = int(string[i+1])
    stock_dict[food] = quantities

for product in search:
    if product in stock_dict:
        print(f"We have {stock_dict[product]} of {product} left")
    else:
        print(f"Sorry, we don't have {product}")
