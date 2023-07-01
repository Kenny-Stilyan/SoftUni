
# Multiplying
def multiplying(num1, num2, num3):
    result = num1 * num2 * num3
    if result == 0:
        return "zero"
    elif result > 0:
        return "positive"
    else:
        return "negative"

# WITHOUT multiplying
def without_multiplying(num1, num2, num3):
    negative_num_count = 0

    if num1 < 0:
        negative_num_count += 1
    if num2 < 0:
        negative_num_count += 1
    if num3 < 0:
        negative_num_count += 1

    if num1 == 0 or num2 == 0 or num3 == 0:
        return "zero"
    elif negative_num_count > 0:
        return "negative"
    else:
        return "positive"


num1 = int(input())
num2 = int(input())
num3 = int(input())

#print(multiplying(num1, num2, num3))
print(without_multiplying(num1, num2, num3))

