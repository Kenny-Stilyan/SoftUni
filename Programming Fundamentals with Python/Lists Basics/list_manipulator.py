
def manipulate_list(initial_list, commands):
    lst = initial_list.copy()
    for command in commands:
        if command.startswith("exchange"):
            index = int(command.split()[1])
            lst = exchange_list(lst, index)
        elif command.startswith("max even"):
            lst = find_max_even(lst)
        elif command.startswith("max odd"):
            lst = find_max_odd(lst)
        elif command.startswith("min even"):
            lst = find_min_even(lst)
        elif command.startswith("min odd"):
            lst = find_min_odd(lst)
        elif command.startswith("first"):
            count, parity = int(command.split()[1]), 0 if command.split()[2] == "even" else 1
            lst = get_first_elements(lst, count, parity)
        elif command.startswith("last"):
            count, parity = int(command.split()[1]), 0 if command.split()[2] == "even" else 1
            lst = get_last_elements(lst, count, parity)
        elif command == "end":
            break
    print(lst)

def exchange_list(lst, index):
    if index < 0 or index >= len(lst):
        print("Invalid index")
        return lst
    return lst[index + 1:] + lst[:index + 1]

def find_max_even(lst):
    max_even = float("-inf")
    max_even_index = -1
    for i in range(len(lst)):
        if lst[i] % 2 == 0 and lst[i] >= max_even:
            max_even = lst[i]
            max_even_index = i
    if max_even_index == -1:
        print("No matches")
    else:
        print(max_even_index)
    return lst

def find_max_odd(lst):
    max_odd = float("-inf")
    max_odd_index = -1
    for i in range(len(lst)):
        if lst[i] % 2 != 0 and lst[i] >= max_odd:
            max_odd = lst[i]
            max_odd_index = i
    if max_odd_index == -1:
        print("No matches")
    else:
        print(max_odd_index)
    return lst

def find_min_even(lst):
    min_even = float("inf")
    min_even_index = -1
    for i in range(len(lst)):
        if lst[i] % 2 == 0 and lst[i] <= min_even:
            min_even = lst[i]
            min_even_index = i
    if min_even_index == -1:
        print("No matches")
    else:
        print(min_even_index)
    return lst

def find_min_odd(lst):
    min_odd = float("inf")
    min_odd_index = -1
    for i in range(len(lst)):
        if lst[i] % 2 != 0 and lst[i] <= min_odd:
            min_odd = lst[i]
            min_odd_index = i
    if min_odd_index == -1:
        print("No matches")
    else:
        print(min_odd_index)
    return lst

def get_first_elements(lst, count, parity):
    if count > len(lst):
        print("Invalid count")
        return lst
    elements = [num for num in lst if num % 2 == parity][:count]
    print(elements)
    return lst

def get_last_elements(lst, count, parity):
    if count > len(lst):
        print("Invalid count")
        return lst
    elements = [num for num in lst if num % 2 == parity][-count:]
    print(elements)
    return lst


# Input
initial_list = list(map(int, input().split()))
commands = []
while True:
    command = input()
    if command == "end":
        break
    commands.append(command)

manipulate_list(initial_list, commands)

