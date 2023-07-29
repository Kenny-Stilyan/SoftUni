
def drive(car, distance, fuel, car_dict):
    if car not in car_dict.keys():
        return  # If the car doesn't exist, exit the function

    mileage = car_dict[car][0]
    fuletank = car_dict[car][1]

    if fuletank >= fuel:
        mileage += distance
        fuletank -= fuel
        print(f"{car} driven for {distance} kilometers. {fuel} liters of fuel consumed.")
    else:
        print("Not enough fuel to make that ride")

    # Update the car's mileage and fuel in the dictionary
    car_dict[car][0] = mileage
    car_dict[car][1] = fuletank

    if mileage >= 100_000:
        del car_dict[car]
        print(f"Time to sell the {car}!")

def refuel(car, refueling, car_dict):
    if car not in car_dict.keys():
        return  # If the car doesn't exist, exit the function

    max_tank = 75
    fuletank = car_dict[car][1]

    fuel_space = max_tank - fuletank

    if refueling > fuel_space:
        refueling = fuel_space

    fuletank += refueling

    # Update the car's fuel in the dictionary
    car_dict[car][1] = fuletank

    print(f"{car} refueled with {refueling} liters")

def revert(car, kilometers, car_dict):
    if car not in car_dict.keys():
        return  # If the car doesn't exist, exit the function

    min_mileage = 10_000
    mileage = car_dict[car][0]

    mileage -= kilometers
    if mileage < min_mileage:
        mileage = min_mileage
        car_dict[car][0] = mileage
        return # Exit the function

    # Update the car's mileage in the dictionary
    car_dict[car][0] = mileage

    print(f"{car} mileage decreased by {kilometers} kilometers")


n = int(input())

car_dict = {}
for _ in range(n):
    car, mileage, fuel = input().split("|")
    car_dict[car] = [int(mileage), int(fuel)]

while True:
    instruction = input()
    if instruction == "Stop":
        for car, (mileage, fuel) in car_dict.items():
            print(f"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt.")
        break

    command, *args = instruction.split(" : ")

    if command == "Drive":
        car, distance, fuel = args[0], int(args[1]), int(args[2])
        drive(car, distance, fuel, car_dict)
    elif command == "Refuel":
        car, refueling = args[0], int(args[1])
        refuel(car, refueling, car_dict)
    elif command == "Revert":
        car, kilometers = args[0], int(args[1])
        revert(car, kilometers, car_dict)
