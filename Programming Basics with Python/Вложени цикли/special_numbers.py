
num = int(input())

for i in range(1, 10):
    for x in range(1, 10):
        for y in range(1, 10):
            for z in range(1, 10):
                is_valid = (num % i == 0) and (num % x == 0) and (num % y == 0) and (num % z == 0)

                if is_valid == True:
                    print(f"{i}{x}{y}{z}", end=" ")

