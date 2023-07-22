
def process_input():
    contests = {}
    participants = {}

    while True:
        command = input().strip()
        if command == "no more time":
            break

        username, contest, points = command.split(" -> ")
        points = int(points)

        if contest not in contests:
            contests[contest] = []
        
        if username not in participants:
            participants[username] = {}

        if contest in participants[username]:
            if points > participants[username][contest]:
                participants[username][contest] = points
        else:
            participants[username][contest] = points
            contests[contest].append(username)

    return contests, participants

def print_contests(contests, participants):
    for contest, participants_list in contests.items():
        print(f"{contest}: {len(participants_list)} participants")
        sorted_participants = sorted(participants_list, key=lambda x: (-participants[x][contest], x))
        for position, participant in enumerate(sorted_participants, start=1):
            points = participants[participant][contest]
            print(f"{position}. {participant} <::> {points}")

def print_individual_standings(participants):
    sorted_participants = sorted(participants.items(), key=lambda x: (-sum(x[1].values()), x[0]))
    print("Individual standings:")
    for position, (participant, contests_points) in enumerate(sorted_participants, start=1):
        total_points = sum(contests_points.values())
        print(f"{position}. {participant} -> {total_points}")


contests, participants = process_input()
print_contests(contests, participants)
print_individual_standings(participants)
