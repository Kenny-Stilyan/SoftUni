
word = input()

list = []
for i in range(len(word)):
    if word[i].isupper() == True:
        list.append(i)

print(list)
