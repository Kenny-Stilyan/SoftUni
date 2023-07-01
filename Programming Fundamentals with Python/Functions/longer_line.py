import math

def distance(x1, y1, x2, y2):
    return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

def print_longer_line(x1, y1, x2, y2, x3, y3, x4, y4):
    x1y1 = distance(x1, y1, 0, 0)
    x2y2 = distance(x2, y2, 0, 0)
    x3y3 = distance(x3, y3, 0, 0)
    x4y4 = distance(x4, y4, 0, 0)

    # Calculate the lengths of the lines using the distance formula
    line_1 = x1y1 + x2y2
    line_2 = x3y3 + x4y4

    if line_1 >= line_2:
        if x1y1 <= x2y2:
            print(f"({math.floor(x1)}, {math.floor(y1)})({math.floor(x2)}, {math.floor(y2)})")
        else:
            print(f"({math.floor(x2)}, {math.floor(y2)})({math.floor(x1)}, {math.floor(y1)})")
    else:
        if x3y3 <= x4y4:
            print(f"({math.floor(x3)}, {math.floor(y3)})({math.floor(x4)}, {math.floor(y4)})")
        else:
            print(f"({math.floor(x4)}, {math.floor(y4)})({math.floor(x3)}, {math.floor(y3)})")


x1 = float(input())
y1 = float(input())
x2 = float(input())
y2 = float(input())
x3 = float(input())
y3 = float(input())
x4 = float(input())
y4 = float(input())

print_longer_line(x1, y1, x2, y2, x3, y3, x4, y4)
