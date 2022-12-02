
book = input()
x = input()
count = 0

the_book = False
while x != "No More Books":
    if x == book:
        the_book = True
        break
    count += 1
    x = input() 
    
    
if the_book:
    print(f"You checked {count} books and found it.")
else:
    print("The book you search is not here!")
    print(f"You checked {count} books.")


