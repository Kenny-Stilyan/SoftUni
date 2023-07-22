
def join_force_side(force_user, force_side, force_dict):
    if force_side not in force_dict:
        force_dict[force_side] = []
    force_dict[force_side].append(force_user)


def change_force_side(force_user, force_side, force_dict):
    for side, users in force_dict.items():
        if force_user in users:
            users.remove(force_user)
            break
    join_force_side(force_user, force_side, force_dict)

def check(force_dict):
    sides_to_remove = [side for side, users in force_dict.items() if len(users) <= 0]
    for side in sides_to_remove:
        del force_dict[side]


force_dict = {}
while True:
    command = input()
    if command == "Lumpawaroo":
        break

    if "|" in command:
        force_side, force_user = command.split(" | ")

        if force_user not in [user for users in force_dict.values() for user in users]:
            if force_side not in force_dict:
                force_dict[force_side] = []

            force_dict[force_side].append(force_user)
    elif "->" in command:
        force_user, force_side = command.split(" -> ")
        for side, users in force_dict.items():
            if force_user in users:
                users.remove(force_user)
                break

        if force_side not in force_dict:
            force_dict[force_side] = []

        force_dict[force_side].append(force_user)
        print(f"{force_user} joins the {force_side} side!")

check(force_dict)

for force_side, force_users in force_dict.items():
    print(f"Side: {force_side}, Members: {len(force_users)}")
    for force_user in force_users:
        print(f"! {force_user}")
