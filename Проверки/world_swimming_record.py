
record = float(input())
distance = float(input())
time_distance = float(input())

need_to_swim = distance * time_distance
add_time = (distance // 15)* 12.5
total_time = need_to_swim + add_time

if record < total_time:
    needed_time = abs(total_time - record)
    print(f"No, he failed! He was {needed_time:.2f} seconds slower.")
else:
    world_record = total_time
    print(f"Yes, he succeeded! The new world record is {world_record:.2f} seconds.")

"""
# Read user input
world_record = float(input())
distance = float(input())
swimming_time = float(input())

# Logic

time_to_finish = distance * swimming_time
delay = (distance // 15) * 12.5

time_to_finish += delay

# Print Output

if time_to_finish < world_record:
    print(f'Yes, he succeeded! The new world record is {time_to_finish:.2f} seconds.')
else:
    print(f'No, he failed! He was {time_to_finish - world_record:.2f} seconds slower.')
"""




