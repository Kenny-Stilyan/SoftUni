
def merge(data, start, end):
    if start < 0:
        start = 0
    if end > len(data) - 1:
        end = len(data) - 1

    for index, string in enumerate(data):
        if index in range(start + 1, end + 1):
            data[start] += data[index]

    for index in range(end, start, -1):
        data.pop(index)

    return data

def divide(data, index, partitions):
    if partitions > len(data[index]):
        step = 1
    else:
        step = len(data[index]) // partitions

    divide_part = data.pop(index)
    start = 0
    for parts in range(partitions):
        if parts == partitions - 1:
            data.insert(index, divide_part[start::])
            break
        else:
            data.insert(index, divide_part[start: start + step:])
        start += step
        index += 1

    return data

data = input().split()
instructions = input()
while instructions != "3:1":
    instructions = instructions.split()
    command = instructions[0]

    if command == "merge":
        start = int(instructions[1])
        end = int(instructions[2])
        data = merge(data, start, end)
    elif command == "divide":
        index = int(instructions[1])
        partitions = int(instructions[2])
        data = divide(data, index, partitions)

    instructions = input()

print(" ".join(data))
