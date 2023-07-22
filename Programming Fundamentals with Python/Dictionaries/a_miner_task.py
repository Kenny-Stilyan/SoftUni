
resources_dict = {}
while True:
    curr_resource = input()
    if curr_resource == "stop":
        break

    curr_quantity = int(input())
    if curr_resource not in resources_dict:
        resources_dict[curr_resource] = curr_quantity
    else:
        resources_dict[curr_resource] += curr_quantity

for resource, quantity in resources_dict.items():
    print(f"{resource} -> {quantity}")






