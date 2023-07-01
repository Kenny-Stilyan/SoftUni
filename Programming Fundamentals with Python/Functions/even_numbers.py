
def is_even(n):
    return n % 2 == 0

# Input
numbers = [int(i) for i in input().split()]

even_numbers = list(filter(is_even, numbers))
print(even_numbers)
