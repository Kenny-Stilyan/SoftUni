
num = int(input())

num_to_str = str(num)
digits = list(num_to_str)
sorting_digits = sorted(digits, reverse=True)
largest_num_str = "".join(sorting_digits)
largest_num = int(largest_num_str)

print(largest_num)

