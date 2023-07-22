
def add_player(player, position, skill):
    if player not in players:
        players[player] = {}
    if position not in players[player] or players[player][position] < skill:
        players[player][position] = skill

def duel_players(player1, player2):
    if player1 in players and player2 in players:
        common_positions = set(players[player1].keys()) & set(players[player2].keys())

        if common_positions:
            total_skill1 = sum(players[player1][pos] for pos in common_positions)
            total_skill2 = sum(players[player2][pos] for pos in common_positions)

            if total_skill1 > total_skill2:
                del players[player2]
            elif total_skill1 < total_skill2:
                del players[player1]


players = {}

while True:
    command = input().strip()
    if command == "Season end":
        break

    if "vs" in command:
        player1, player2 = command.split(" vs ")
        duel_players(player1, player2)
    else:
        player, position, skill = command.split(" -> ")
        skill = int(skill)
        add_player(player, position, skill)

# Sort the players based on their total skill points and name
sorted_players = sorted(players.items(), key=lambda x: (-sum(x[1].values()), x[0]))

for player, positions in sorted_players:
    total_skill = sum(positions.values())
    print(f"{player}: {total_skill} skill")
    # Sort positions based on skill and name and print them
    for position, skill in sorted(positions.items(), key=lambda x: (-x[1], x[0])):
        print(f"- {position} <::> {skill}")
