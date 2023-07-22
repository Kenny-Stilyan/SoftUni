
# Process contests input
contests_dict = {}
while True:
    contest_input = input()
    if contest_input == "end of contests":
        break

    contest, password = contest_input.split(":")
    contests_dict[contest] = password

# Process submissions input
submissions_dict = {}
while True:
    submission_input = input()
    if submission_input == "end of submissions":
        break

    contest, password, username, points = submission_input.split("=>")
    points = int(points)

    if contest in contests_dict and contests_dict[contest] == password:
        if username not in submissions_dict:
            submissions_dict[username] = {}

        if contest not in submissions_dict[username] or points > submissions_dict[username][contest]:
            submissions_dict[username][contest] = points

# Calculate the total points for each user
user_points = {user: sum(submissions_dict[user].values()) for user in submissions_dict}

# Find the best candidate with the most total points
best_candidate = max(user_points, key=user_points.get)
total_points = user_points[best_candidate]

# Print the best candidate
print(f"Best candidate is {best_candidate} with total {total_points} points.")

# Sort users by name and print the ranking
print("Ranking:")
for user in sorted(submissions_dict.keys()):
    print(user)
    # Sort contests and points for each user by points (descending) and contest name (ascending)
    for contest, points in sorted(submissions_dict[user].items(), key=lambda x: (-x[1], x[0])):
        print(f"#  {contest} -> {points}")

