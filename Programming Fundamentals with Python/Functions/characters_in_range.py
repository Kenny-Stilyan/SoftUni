
def ASCII_code(char1, char2):
    start = ord(char1) 
    finish = ord(char2)
    return [chr(i) for i in range(start +1, finish)]


char1 = input()
char2 = input()

result = ASCII_code(char1, char2)
print(" ".join(result))
