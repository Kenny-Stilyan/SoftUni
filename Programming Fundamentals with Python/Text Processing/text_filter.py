
banned_words = input().split(", ")
text = input()

for banned_word in banned_words:
    while banned_word in text:
        text_replacing = "*" * len(banned_word)
        text = text.replace(banned_word, text_replacing)

print(text)
