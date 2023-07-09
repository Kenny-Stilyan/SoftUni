
def checking_rooms(rooms):
    free_chairs = 0
    needed_chairs = 0

    for num_room in range(1, rooms + 1):
        chairs, visitors = input().split()
        difference = len(chairs) - int(visitors)

        if difference < 0:
            print(f"{abs(difference)} more chairs needed in room {num_room}")
            needed_chairs += abs(difference)
        else:  # difference >=0:
            free_chairs += difference
 
    return free_chairs, needed_chairs


rooms = int(input())

total_chairs, total_visitors = checking_rooms(rooms)
if total_chairs >= total_visitors:
    print(f"Game On, {total_chairs} free chairs left")
