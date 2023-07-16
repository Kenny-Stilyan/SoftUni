
def find_odd_occurrence(arr):
    result = 0
    for num in arr:
        result ^= num  # Perform bitwise XOR of the result and the current number
    return result


input_str = input("Enter an array of positive integers separated by a space: ")
arr = list(map(int, input_str.split()))

result = find_odd_occurrence(arr)
print(f"The number occurring an odd number of times is: {result}")
