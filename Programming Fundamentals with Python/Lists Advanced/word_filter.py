
filterd_words = [word for word in input().split() if len(word) % 2 == 0]

print("\n".join(filterd_words))

'''
words = input().split()
filtered_words = [word for word in words if len(word) % 2 == 0]
print("\n".join(filtered_words))
'''
