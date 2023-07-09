
numbers = [int(num) for num in input().split(", ")]
even_numbers = [i for i, num in enumerate(numbers) if num % 2 == 0]

print(even_numbers)

'''
def find_even_indices(numbers):
    number_list = numbers.split(", ")
    even_indices = []
    for i, num in enumerate(number_list):
        if int(num) % 2 == 0:
            even_indices.append(i)
    return even_indices


input_string = input()

indices = find_even_indices()
print(indices)
'''

'''
def find_even_indices(numbers):
    numbers_list = numbers.split(", ")

    numbers_list = list(map(int, numbers_list))
    even_indices = [index for index, num in enumerate(numbers_list) if num % 2 == 0]
    return even_indices


input_string = input("Enter numbers separated by comma and space: ")

even_indices = find_even_indices(input_string)
print(even_indices)
'''
