
num = float(input())

if num == 0:
    print("zero")
if num > 0:
    if num < 1:
        print("small positive")
    elif num > 1_000_000: # 1_000_000 -> 1000000
        print("large positive")
    else:
        print("positive")
if num < 0:
    if abs(num) < 1:
        print("small negative")
    elif abs(num) > 1_000_000:
        print("large negative")
    else:
        print("negative")

