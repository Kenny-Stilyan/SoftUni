
def get_bit_at_position(number, position):
    binary_string = bin(number)[2:]
    if position < len(binary_string):
        bit = binary_string[-position - 1]
        return int(bit)
    else:
        return None


number = int(input("Enter an integer: "))
position = int(input("Enter the position of the bit: "))

result = get_bit_at_position(number, position)
if result is not None:
    print(f"The bit at position ({position}) of {number} is: {result}")
else:
    print(f"The bit at position ({position}) is out of range for the given number.")
