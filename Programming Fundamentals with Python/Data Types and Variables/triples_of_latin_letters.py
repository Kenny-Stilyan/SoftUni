
n = int(input())

for x in range(0, n):
    for y in range(0, n):
        for z in range(0, n):
            print(f"{chr(x+97)}{chr(y+97)}{chr(z+97)}")
