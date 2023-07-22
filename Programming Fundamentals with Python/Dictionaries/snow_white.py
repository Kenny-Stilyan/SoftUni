
dwarfs = {}
hat_color_count = {}

while True:
    line = input()
    if line == "Once upon a time":
        break

    dwarf_name, dwarf_hat_color, dwarf_physics = line.strip().split(" <:> ")
    dwarf_physics = int(dwarf_physics)

    # Create a unique identifier for each dwarf based on name and color
    dwarf_identifier = f"{dwarf_name} {dwarf_hat_color}"

    if dwarf_identifier in dwarfs:
        # Check if a dwarf with the same name and color exists, and store the one with higher physics
        if dwarf_physics > dwarfs[dwarf_identifier][1]:
            dwarfs[dwarf_identifier] = (dwarf_hat_color, dwarf_physics)
    else:
        dwarfs[dwarf_identifier] = (dwarf_hat_color, dwarf_physics)

    # Update the count of dwarfs with the same hat color
    hat_color_count[dwarf_hat_color] = hat_color_count.get(dwarf_hat_color, 0) + 1

# Sort the dwarfs based on physics and hat color count
sorted_dwarfs = sorted(dwarfs.items(), key=lambda x: (-x[1][1], -hat_color_count[x[1][0]]))

# Print the sorted dwarfs
for dwarf_identifier, (dwarf_hat_color, dwarf_physics) in sorted_dwarfs:
    dwarf_name = dwarf_identifier.split()[0]
    print(f"({dwarf_hat_color}) {dwarf_name} <-> {dwarf_physics}")
