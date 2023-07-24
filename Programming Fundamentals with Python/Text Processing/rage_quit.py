
def rage_quit(input_string):
    rage_message = ""
    unique_symbols = set()

    i = 0
    while i < len(input_string):
        # Extract the string and number pair
        string = ""
        while i < len(input_string) and not input_string[i].isdigit():
            string += input_string[i]
            i += 1

        # Convert the string to uppercase
        string = string.upper()

        # Extract the number and repeat the string accordingly
        number = 0
        while i < len(input_string) and input_string[i].isdigit():
            number = number * 10 + int(input_string[i])
            i += 1

        rage_message += string * number

        # Update the set of unique symbols
        unique_symbols.update(set(string))

    # Print the statistics and the rage message
    print(f"Unique symbols used: {len(unique_symbols)}")
    print(rage_message)


input_data = input().strip()
rage_quit(input_data)
