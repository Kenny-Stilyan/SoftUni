
snowballs = int(input())

max_weight = 0
max_time = 0
max_val = 0
max_quality = 0
for i in range(snowballs):
    weight_snowball = int(input())
    time_needed = int(input())
    quality = int(input())

    snowball_value = (weight_snowball / time_needed) ** quality
    if snowball_value > max_val:
        max_weight = weight_snowball
        max_time = time_needed
        max_val = snowball_value
        max_quality = quality

print(f"{max_weight} : {max_time} = {max_val:.0f} ({max_quality})" )

