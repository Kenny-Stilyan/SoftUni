
efficiencies = []
for _ in range(3):
    efficiency = int(input())
    efficiencies.append(efficiency)

total_efficiency = sum(efficiencies)
total_students = int(input())

total_time = 0
while total_students > 0:
    total_students -= total_efficiency
    total_time += 1

    if total_time % 4 == 0:
        total_time += 1

print(f"Time needed: {total_time}h.")
