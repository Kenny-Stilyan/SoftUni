
n = int(input())

COMMAND_EVEN  = "even" 
COMMAND_ODD  = "odd" 
COMMAND_NEGATIVE  = "negative" 
COMMAND_POSITIVE  = "positive"

numbers = []
for _ in range(n):
    num = int(input())
    numbers.append(num)

command = input()

filterd_list = []
for i in numbers:
    filterd_command = (
                        (command == COMMAND_EVEN and i % 2 == 0) or 
                        (command == COMMAND_ODD and i % 2 != 0) or 
                        (command == COMMAND_NEGATIVE and i < 0) or
                        (command == COMMAND_POSITIVE and i >= 0)
                      )
    if filterd_command:
        filterd_list.append(i)

print(filterd_list)
