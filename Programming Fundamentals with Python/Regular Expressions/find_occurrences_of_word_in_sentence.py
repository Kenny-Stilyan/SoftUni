import re

def count_occurrences(sentence, word):
    pattern = r"\b" + re.escape(word) + r"\b"
    occurrences = re.findall(pattern, sentence)
    return len(occurrences)


sentence = input().lower()
word = input().lower()

result = count_occurrences(sentence, word)
print(result)
