
team_a = [f"A-{i}" for i in range(1, 12)] 
team_b = [f"B-{i}" for i in range(1, 12)]

players_sent_off = input().split()

stop = False
for player in players_sent_off:
    if player in team_a:
        team_a.remove(player)
    elif player in team_b:
        team_b.remove(player)

    if len(team_a) < 7 or len(team_b) < 7:
        stop = True
        break

print(f"Team A - {len(team_a)}; Team B - {len(team_b)}")
if stop:
    print("Game was terminated")

