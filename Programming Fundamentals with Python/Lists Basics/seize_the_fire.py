
cells_input = input().split("#")
amount_of_water = int(input())

high   = range(81, 125+1)
medium = range(51, 80+1)
low    = range(1, 50+1)

effort = 0
total_fire = 0
list_fire = []
for cell in cells_input:
    type_fire, value_cell = cell.split(" = ")
    value_cell = int(value_cell)

    is_valid_cell = False
    if type_fire == "High":
        if value_cell in high:
            is_valid_cell = True
    elif type_fire == "Medium":
        if value_cell in medium:
            is_valid_cell = True
    elif type_fire == "Low":
        if value_cell in low:
            is_valid_cell = True

    if is_valid_cell:
        if amount_of_water >= value_cell:
            amount_of_water -= value_cell
            total_fire += value_cell
            effort += value_cell * 0.25
            list_fire.append(value_cell)

print("Cells:")
for i in list_fire:
    print(f"- {i}")
print(f"Effort: {effort:.2f}")
print(f"Total Fire: {total_fire}")


