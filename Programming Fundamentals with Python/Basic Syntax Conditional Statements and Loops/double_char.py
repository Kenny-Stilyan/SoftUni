
curr_str = input()

while curr_str != "End":
    if curr_str != "SoftUni":
        new_str = ""

        for char in curr_str:
            new_str += char * 2
        print(new_str, end="")
        curr_str = input()


