
def get_default_stats():
    return {
        'damage': 45,
        'health': 250,
        'armor': 10
    }

def parse_input_data(input_data):
    data = {}
    for line in input_data:
        dragon_info = line.split()
        dragon_type, dragon_name = dragon_info[0], dragon_info[1]
        damage = int(dragon_info[2]) if dragon_info[2] != 'null' else get_default_stats()['damage']
        health = int(dragon_info[3]) if dragon_info[3] != 'null' else get_default_stats()['health']
        armor =  int(dragon_info[4]) if dragon_info[4] != 'null' else get_default_stats()['armor']

        if dragon_type not in data:
            data[dragon_type] = {}

        data[dragon_type][dragon_name] = {'damage': damage, 'health': health, 'armor': armor}

    return data

def print_dragons_stats(data):
    for dragon_type, dragons in data.items():
        total_damage = sum(d['damage'] for d in dragons.values()) / len(dragons)
        total_health = sum(d['health'] for d in dragons.values()) / len(dragons)
        total_armor =  sum(d['armor']  for d in dragons.values()) / len(dragons)

        print(f"{dragon_type}::({total_damage:.2f}/{total_health:.2f}/{total_armor:.2f})")
        for dragon_name, dragon_stats in sorted(dragons.items()):
            damage, health, armor = dragon_stats['damage'], dragon_stats['health'], dragon_stats['armor']
            print(f"-{dragon_name} -> damage: {damage}, health: {health}, armor: {armor}")


n = int(input())
input_data = []
for _ in range(n):
    dragon_input = input()
    input_data.append(dragon_input)

dragons_data = parse_input_data(input_data)
print_dragons_stats(dragons_data)
