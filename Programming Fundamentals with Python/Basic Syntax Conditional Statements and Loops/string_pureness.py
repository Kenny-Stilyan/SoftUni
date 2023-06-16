
n = int(input())

chars_to_check =[".", ",", "_"]
for i in range(n):
    string = input()
    is_pure = True

    for char in chars_to_check:
        if char in string:
            is_pure = False

    if is_pure:
        print(f"{string} is pure." )
    else:
        print(f"{string} is not pure!")
