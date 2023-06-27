
def tic_tac_toe_winner(field):
    # Check rows
    for row in field:
        if row[0] == row[1] == row[2] != 0:
            return "First player won" if row[0] == 1 else "Second player won"

    # Check columns
    for column in range(3):
        if field[0][column] == field[1][column] == field[2][column] != 0:
            return "First player won" if field[0][column] == 1 else "Second player won"

    # Check diagonals
    if field[0][0] == field[1][1] == field[2][2] != 0:
        return "First player won" if field[0][0] == 1 else "Second player won"
    if field[0][2] == field[1][1] == field[2][0] != 0:
        return "First player won" if field[0][2] == 1 else "Second player won"

    return "Draw!"

# Prompt the user to enter the tic-tac-toe field
field = []
for _ in range(3):
    row = list(map(int, input().split())) # Input
    field.append(row)

result = tic_tac_toe_winner(field)
print(result)
