
def get_bit_at_position(number):
    binary_string = bin(number)[2:]
    bit = binary_string[-2]
    return int(bit)


number = int(input("Enter an integer: "))

result = get_bit_at_position(number)
print(f"The bit at position (1) of {number} is: {result}")
