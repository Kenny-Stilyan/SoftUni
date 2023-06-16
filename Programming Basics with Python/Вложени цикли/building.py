
level = int(input())
room= int(input())

flat_num = 0
flat = ""
for levels in range(level, 0 ,-1):
    for rooms in range(0, room):
        flat_num = levels * 10 + rooms

        if levels == level:
            flat = f"L{flat_num}"
        elif level % 2 == 0:
            flat = f"A{flat_num}"
        elif level % 2 != 0:
            flat = f"O{flat_num}"
        
        print(flat, end=" ")

    print()



