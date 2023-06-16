import sys

insert = input()
min_num = sys.maxsize

while insert != "Stop":
    num = int(insert) 
    if min_num > num:
        min_num = num
    
    insert = input()

print(min_num)



