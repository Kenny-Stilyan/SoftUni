
farm = input()

list = []
list = farm.split(", ")
list.reverse()

for i in range(len(list)):
    if "wolf" in list[i]:
        if i == 0:
            print(f"Please go away and stop eating my sheep")
        else:
            print(f"Oi! Sheep number {i}! You are about to be eaten by a wolf!")
            break
