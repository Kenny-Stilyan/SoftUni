import sys

insert = input()
max_num = -sys.maxsize

while insert != "Stop":
    num = int(insert) 
    if max_num < num:
        max_num = num
    
    insert = input()

print(max_num)



