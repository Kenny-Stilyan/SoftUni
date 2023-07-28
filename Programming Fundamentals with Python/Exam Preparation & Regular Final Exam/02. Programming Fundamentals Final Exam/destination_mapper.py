import re

def filter_valid_locations(input_string):
    pattern = r"[=]([A-Z][a-zA-Z]{2,})[=]|[/]([A-Z][a-zA-Z]{2,})[/]"
    valid_locations = re.findall(pattern, input_string)
    valid_locations = [location for tup in valid_locations for location in tup if location]
    return valid_locations

def points(valid_locations):
    travel_points = [len(location) for location in valid_locations]
    return sum(travel_points)


string = input()
valid_locations = filter_valid_locations(string)
travel_points = points(valid_locations)

print(f"Destinations: {', '.join(valid_locations)}")
print(f"Travel Points: {travel_points}")
