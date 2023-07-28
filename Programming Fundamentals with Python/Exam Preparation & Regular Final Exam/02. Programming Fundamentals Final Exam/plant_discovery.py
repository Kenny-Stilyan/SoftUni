
def add_rating(plants_dict, plant_name, rating):
    if plant_name in plants_dict:
        plants_dict[plant_name][1].append(rating)
    else:
        print("error")

def update_rarity(plants_dict, plant_name, new_rarity):
    if plant_name in plants_dict:
        plants_dict[plant_name] = (float(new_rarity), plants_dict[plant_name][1])
    else:
        print("error")

def reset_ratings(plants_dict, plant_name):
    if plant_name in plants_dict:
        plants_dict[plant_name] = (plants_dict[plant_name][0], [])
    else:
        print("error")


n = int(input())

exhibition_dict = {}
for _ in range(n):
    plant, rarity = input().split("<->")
    exhibition_dict[plant] = (float(rarity), [])

while True:
    instruction = input()
    if instruction == "Exhibition":
        print("Plants for the exhibition:")
        for plant, (rarity, ratings) in exhibition_dict.items():
            average_rating = sum(ratings) / len(ratings) if len(ratings) > 0 else 0
            print(f"- {plant}; Rarity: {rarity:.0f}; Rating: {average_rating:.2f}")
        break

    command, args = instruction.split(": ")

    if command == "Rate":
        plant, rating = args.split(" - ")
        add_rating(exhibition_dict, plant, float(rating))
    elif command == "Update":
        plant, new_rarity = args.split(" - ")
        update_rarity(exhibition_dict, plant, new_rarity)
    elif command == "Reset":
        plant = args
        reset_ratings(exhibition_dict, plant)

