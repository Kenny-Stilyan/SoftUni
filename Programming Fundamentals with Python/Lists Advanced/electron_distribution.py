
electrons = int(input())

n = 1
shells = []
while electrons > 0:
    max_electrons = 2 * (n**2)

    if electrons >= max_electrons:
        shells.append(max_electrons)
        electrons -= max_electrons
    else:
        shells.append(electrons)
        electrons = 0

    n += 1

print(shells)
