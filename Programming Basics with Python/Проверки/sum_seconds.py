import math

first_time = int(input())
second_time = int(input())
third_time = int(input())

total_time = first_time + second_time + third_time

min = math.floor(total_time / 60)
sec = total_time % 60

if sec < 10:
    print(f"{min}:0{sec}")
else:
    print(f"{min}:{sec}")