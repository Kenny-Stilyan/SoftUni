
ticket_type = input()
rows = int(input())
colums = int(input())

cinema_seats = rows * colums

if ticket_type == "Premiere":
    total_price = cinema_seats * 12
elif ticket_type == "Normal":
    total_price = cinema_seats * 7.50
elif ticket_type == "Discount":
    total_price = cinema_seats * 5

print(f"{total_price:.2f}")












