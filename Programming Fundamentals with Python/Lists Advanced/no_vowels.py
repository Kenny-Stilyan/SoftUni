
text = input()
vowels = ["a", "o", "u", "e", "i"]

sorted_text = [letter for letter in text if letter.lower() not in vowels]
print("".join(sorted_text))
