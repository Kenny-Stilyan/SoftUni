
def change_painting(paintings, old_number, new_number):
    if old_number in paintings:
        index = paintings.index(old_number)
        paintings[index] = new_number

def hide_painting(paintings, number):
    if number in paintings:
        paintings.remove(number)

def switch_paintings(paintings, number1, number2):
    if number1 in paintings and number2 in paintings:
        index1 = paintings.index(number1)
        index2 = paintings.index(number2)
        paintings[index1], paintings[index2] = paintings[index2], paintings[index1]

def insert_painting(paintings, index, number):
    if 0 <= index < len(paintings):
        paintings.insert(index + 1, number)

def reverse_paintings(paintings):
    paintings.reverse()


paintings = list(map(int, input().split()))

while True:
    command = input()
    if command == "END":
        break

    tokens = command.split()
    instruction = tokens[0]

    if instruction == "Change":
        old_number, new_number = map(int, tokens[1:])
        change_painting(paintings, old_number, new_number)
    elif instruction == "Hide":
        number = int(tokens[1])
        hide_painting(paintings, number)
    elif instruction == "Switch":
        number1, number2 = map(int, tokens[1:])
        switch_paintings(paintings, number1, number2)
    elif instruction == "Insert":
        index, number = map(int, tokens[1:])
        insert_painting(paintings, index, number)
    elif instruction == "Reverse":
        reverse_paintings(paintings)

print(" ".join(map(str, paintings)))


