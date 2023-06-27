
gifts = input().split()

command = input()
while command != "No Money":
    command_args = command.split()

    if command_args[0] == "OutOfStock":
        gift = command_args[1]
        for i in range(len(gifts)):
            if gifts[i] == gift:
                gifts[i] = "None"

    elif command_args[0] == "Required":
        index = int(command_args[2])
        if 0 <= index < len(gifts):
            gifts[index] = command_args[1]

    elif command_args[0] == "JustInCase":
        gifts[-1] = command_args[1]

    command = input()

filtered_gifts = []
for gift in gifts:                     #gifts = [gift for gift in gifts if gift != "None"]
    if gift != "None":
        filtered_gifts.append(gift)

print(" ".join(filtered_gifts))        #print(" ".join(gifts))



