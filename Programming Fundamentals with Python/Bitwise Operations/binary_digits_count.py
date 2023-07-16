
def count_binary_digits(number, digit):
    binary_string = bin(number)[2:]
    count = binary_string.count(str(digit))
    return count


number = int(input("Enter a positive integer: "))
digit = int(input("Enter the binary digit (0 or 1): "))

result = count_binary_digits(number, digit)
print(f"The number of binary digits ({digit}) in {number} is: {result}")

