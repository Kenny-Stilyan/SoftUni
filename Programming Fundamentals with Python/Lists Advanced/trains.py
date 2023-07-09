
wagons = int(input())
list_train = [0] * wagons


while True:
    command = input().split()

    if command[0] == "End":
        print(list_train)
        break

    if command[0] == "add":
        list_train[-1] += int(command[1])
    elif command[0] == "insert":
        index = int(command[1])
        num_people = int(command[2])
        list_train[index] += num_people 
    elif command[0] == "leave":
        index = int(command[1])
        num_people = int(command[2])
        list_train[index] -= num_people

