
def is_prime(num):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                return False
        else:
            return True
    else:
        return False

number = int(input())
if is_prime(number):
    print("True")
else:
    print("False")

