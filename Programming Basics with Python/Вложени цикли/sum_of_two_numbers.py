
interval_start = int(input())
interval_end = int(input())
input_magic_num = int(input())

combination = 0
magic_num = False
for x1 in range(interval_start, interval_end+1):
    for x2 in range(interval_start, interval_end+1):
        combination += 1
        if x1 + x2 == input_magic_num:
            print(f"Combination N:{combination} ({x1} + {x2} = {input_magic_num})")
            magic_num = True

    if magic_num:
        break

if not magic_num:
    print(f"{combination} combinations - neither equals {input_magic_num}")


