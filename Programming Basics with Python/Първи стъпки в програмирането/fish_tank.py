
wide = int(input())
lenght = int(input())
height = int(input())
percent = float(input())

volume = wide * lenght * height
volume_liters = volume / 1000
needed_liters = volume_liters * (1 - percent/100)

print(needed_liters)