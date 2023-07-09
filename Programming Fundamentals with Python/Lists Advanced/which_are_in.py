
first_sequence = input().split(", ")
second_sequence = input().split(", ")

substrings = []

for first_str in first_sequence:
    for second_str in second_sequence:
        if first_str in second_str:
            substrings.append(first_str)
            break

print(substrings)

