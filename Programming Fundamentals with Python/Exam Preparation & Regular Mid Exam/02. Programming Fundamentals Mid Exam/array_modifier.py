
array = [int(num) for num in input().split()]

while True:
    instruction = input()
    if instruction == "end":
        print(*array, sep=", ")
        break

    command, *args = instruction.split()

    if command == "swap":
        index1, index2 = int(args[0]), int(args[1])
        array[index1], array[index2] = array[index2], array[index1]
    elif command == "multiply":
        index1, index2 = int(args[0]), int(args[1])
        array[index1] = array[index1] * array[index2]
    elif command == "decrease":
        array = [num-1 for num in array]
