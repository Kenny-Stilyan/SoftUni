
def print_odd_occurrences(words):
    word_count = {}
    result = []

    # Count the occurrences of each word
    for word in words:
        word = word.lower()
        if word in word_count:
            word_count[word] += 1
        else:
            word_count[word] = 1

    # Find words with odd occurrences and add them to the result list
    for word, count in word_count.items():
        if count % 2 == 1:
            result.append(word)

    # Print the result in lowercase and order of appearance
    print(' '.join(result))


input_words = input().split()
print_odd_occurrences(input_words)
