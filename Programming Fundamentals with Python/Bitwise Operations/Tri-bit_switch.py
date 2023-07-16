
def invert_tri_bit_switch(number, position):
    mask = 7 << position
    result = number ^ mask
    return result


number = int(input("Enter a number: "))
position = int(input("Enter the position to start inverting the 3 bits: "))

result = invert_tri_bit_switch(number, position)
print(f"The resulting integer after inverting the 3 bits from position ({position}) is: {result}")
