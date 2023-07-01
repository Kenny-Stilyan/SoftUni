
def closest_to_center(x1, y1, x2, y2) -> float:
    # Calculate the distance of the point from the center (0, 0)
    # Distance = √(x^2 + y^2)
    distance1 = (x1 ** 2 + y1 ** 2) ** 0.5
    distance2 = (x2 ** 2 + y2 ** 2) ** 0.5

    if distance1 <= distance2:
        closest_point = f"({int(x1)}, {int(y1)})"
    else:
        closest_point = f"({int(x2)}, {int(y2)})"

    return closest_point


x1 = float(input())
y1 = float(input())
x2 = float(input())
y2 = float(input())

result = closest_to_center(x1, y1, x2, y2)
print(result)
