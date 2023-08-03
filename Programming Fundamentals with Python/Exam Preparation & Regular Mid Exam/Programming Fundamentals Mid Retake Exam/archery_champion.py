archer_shoots = list(map(int, input().split("|")))
total_points = 0

while True:
    command_input = input()

    if command_input == "Game over":
        print(' - '.join(str(x) for x in archer_shoots))
        print(f"John finished the archery tournament with {total_points} points!")
        break

    if command_input == "Reverse":
        archer_shoots = archer_shoots[::-1]
        continue

    _, tokens_data = command_input.split()
    direction, *indexes = tokens_data.split("@")
    starting_index, length = int(indexes[0]), int(indexes[1])

    if direction == "Left":
        if starting_index in range(len(archer_shoots)):
            for _ in range(length):
                starting_index -= 1
                if starting_index not in range(len(archer_shoots)):
                    starting_index = len(archer_shoots) - 1

            if archer_shoots[starting_index] >= 5:
                archer_shoots[starting_index] -= 5
                total_points += 5
            else:
                total_points += archer_shoots[starting_index]
                archer_shoots[starting_index] = 0
    elif direction == "Right":
        if starting_index in range(len(archer_shoots)):
            for _ in range(length):
                starting_index += 1
                if starting_index not in range(len(archer_shoots)):
                    starting_index = 0

            if archer_shoots[starting_index] >= 5:
                archer_shoots[starting_index] -= 5
                total_points += 5
            else:
                total_points += archer_shoots[starting_index]
                archer_shoots[starting_index] = 0
