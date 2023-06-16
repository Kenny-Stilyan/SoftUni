
str_one = input()
str_two = input()

last_combo = str_one
for char in range(len(str_one)):
    mutate_one = str_two[:char + 1]
    mutate_two = str_one[char + 1:]
    new_str = mutate_one + mutate_two

    if new_str == last_combo:
        continue
    
    last_combo = new_str
    print(new_str)

    