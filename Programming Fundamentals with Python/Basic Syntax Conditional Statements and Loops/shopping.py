
budget = int(input())
char = input()

price = 0
total = 0
while char != "End":
    price = int(char)
    total += price

    if budget < total:
        print(f"You went in overdraft!")
        break
    char = input()
else:
    print(f"You bought everything needed.")