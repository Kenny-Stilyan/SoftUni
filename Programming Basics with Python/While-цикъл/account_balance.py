
insert = input()

total = 0.0
while insert != "NoMoreMoney":
    money = float(insert)
    if money < 0:
        print("Invalid operation!")
        break
    
    total += money
    print(f"Increase: {money:.2f}")
    insert = input()

print(f"Total: {total:.2f}") 

