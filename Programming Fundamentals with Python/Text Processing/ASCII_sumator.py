
def ascii_sum_between_chars(start_char, end_char, random_string):
    start_ascii = ord(start_char)
    end_ascii = ord(end_char)
    ascii_sum = 0

    for char in random_string:
        char_ascii = ord(char)
        if start_ascii < char_ascii < end_ascii:
            ascii_sum += char_ascii

    return ascii_sum


start_char = input()
end_char = input()
random_string = input()

result = ascii_sum_between_chars(start_char, end_char, random_string)
print(result)
