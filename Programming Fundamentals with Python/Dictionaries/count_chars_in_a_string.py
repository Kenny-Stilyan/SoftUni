
symbols = [char for char in input() if char != " "]

letters = {}
for symbol in symbols:
    if symbol not in letters.keys():
        letters[symbol] = 0
    letters[symbol] += 1

for character, occurrences in letters.items():
    print(f"{character} -> {occurrences}")

'''
text = input()

letter_counts = {}
for letter in text:
    if letter.isalpha():
        if letter in letter_counts:
            letter_counts[letter] += 1
        else:
            letter_counts[letter] = 1

for character, occurrences in letter_counts.items():
    print(f"{character} -> {occurrences}")
'''