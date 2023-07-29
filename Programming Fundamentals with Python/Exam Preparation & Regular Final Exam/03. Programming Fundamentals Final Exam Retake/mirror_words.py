import re

input_string = input()

word_pairs = []
mirror_words = []

pattern = r"([@#])([A-Za-z]{3,})(\1)(\1)([A-Za-z]{3,})(\1)"
matches = re.findall(pattern, input_string)

for match in matches:
    word_pairs.append(match[1])
    word_pairs.append(match[4])

if len(word_pairs) != 0:
    print(f"{int(len(word_pairs) / 2)} word pairs found!")
else:
    print("No word pairs found!")

for i in range(1, len(word_pairs), 2):
    if word_pairs[i][::-1] == word_pairs[i - 1] and word_pairs[i - 1][::-1] == word_pairs[i]:
        mirror_words.append(word_pairs[i - 1] + " <=> " + word_pairs[i])

if len(mirror_words) > 0:
    print("The mirror words are:")
    print(', '.join(mirror_words))
else:
    print("No mirror words!")
