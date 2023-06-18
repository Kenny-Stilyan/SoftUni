
n = int(input())

water_tank = 255
capacity = 0
for i in range(n):
    liters_of_water = int(input())

    if water_tank - liters_of_water < 0:
        print("Insufficient capacity!")
        continue
    water_tank -= liters_of_water
    capacity += liters_of_water
print(capacity)

