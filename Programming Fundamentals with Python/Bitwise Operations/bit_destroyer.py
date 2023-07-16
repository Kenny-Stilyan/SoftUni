
def set_bit_to_zero(number, position):
    mask = ~(1 << position)
    result = number & mask
    return result


number = int(input("Enter an integer: "))
position = int(input("Enter the position of the bit to set to 0: "))

result = set_bit_to_zero(number, position)
print(f"The resulting integer after setting bit at position ({position}) to 0: {result}")
