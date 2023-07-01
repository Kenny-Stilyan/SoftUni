
def check_palindrome_integers(numbers):
    for number in numbers:
        if str(number) == str(number)[::-1]:
            print("True")
        else:
            print("False")


numbers_list = [int(num) for num in input().split(", ")]
check_palindrome_integers(numbers_list)



'''
numbers = list(map(int, input().strip().split(", ")))

for i in numbers:
    num = str(i)
    if "".join(reversed(num)) == num:
        print("True")
    else:
        print("False")
'''

