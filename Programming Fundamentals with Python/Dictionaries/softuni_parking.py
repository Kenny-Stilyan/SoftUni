
def register(name, plate_num):
    if name not in parking_lot_dict.keys():
        parking_lot_dict[name] = plate_num
        print(f"{name} registered {plate_num} successfully")
    else:
        print(f"ERROR: already registered with plate number {parking_lot_dict[name]}" )

def unregister(name):
    if name not in parking_lot_dict.keys():
        print(f"ERROR: user {name} not found" )
    else:
        del parking_lot_dict[name]
        print(f"{name} unregistered successfully")


n = int(input())
parking_lot_dict = {}

for _ in range(n):
    input_commands = input().split()

    if len(input_commands) == 3:
        command, name, plate_num = input_commands[0], input_commands[1], input_commands[2]
    else:
        command, name = input_commands[0], input_commands[1]

    if command == "register":
        register(name, plate_num)
    elif command == "unregister":
        unregister(name)

for name, plate in parking_lot_dict.items():
    print(f"{name} => {plate}")
