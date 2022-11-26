
boock_list = int(input())
reading = int(input())
days = int(input())

total_reading = boock_list // reading
hours_perday = total_reading // days

print(hours_perday)