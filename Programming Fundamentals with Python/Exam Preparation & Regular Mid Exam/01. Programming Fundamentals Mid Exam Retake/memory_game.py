
sequence = list(map(str, input().split()))

moves = 0
while True:
    command = input().split()

    if command[0] == "end":
        break

    idx1, idx2 = map(int, command)

    if idx1 == idx2 or idx1 < 0 or idx1 >= len(sequence) or idx2 < 0 or idx2 >= len(sequence):
        moves += 1
        new_element = f"-{moves}a"
        sequence.insert(len(sequence) // 2, new_element)
        sequence.insert(len(sequence) // 2, new_element)
        print("Invalid input! Adding additional elements to the board")
    else:
        moves += 1
        element1, element2 = sequence[idx1], sequence[idx2]

        if element1 == element2:
            sequence = [elem for idx, elem in enumerate(sequence) if idx != idx1 and idx != idx2]
            print(f"Congrats! You have found matching elements - {element1}!")
        else:
            print("Try again!")

        if not sequence:
            print(f"You have won in {moves} turns!")
            break

if sequence:
    print("Sorry you lose :(")
    print(" ".join(map(str, sequence)))
