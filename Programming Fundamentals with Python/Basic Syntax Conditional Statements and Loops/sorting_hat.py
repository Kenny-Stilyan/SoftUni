
name = input()

check = True
while True:
    if name == "Voldemort":
        check = False
        print(f"You must not speak of that name!")
    if name == "Welcome":
        check = False
        print(f"Welcome to Hogwarts.")

    if len(name) < 5:
        print(f"{name} goes to Gryffindor.") 
    elif len(name) == 5:
        print(f"{name} goes to Slytherin.")
    elif len(name) < 6:
        print(f"{name} goes to Ravenclaw.")
    elif len(name) == 5:
        print(f"{name} goes to Hufflepuff." ) 