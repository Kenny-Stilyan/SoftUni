
numbers = [int(num) for num in input().split(", ")]
curr_group_num = 10

while numbers:
    filtered_numbers = [num for num in numbers if num <= curr_group_num]
    print(f"Group of {curr_group_num}'s: {filtered_numbers}")

    curr_group_num += 10
    numbers = [num for num in numbers if num not in filtered_numbers]
