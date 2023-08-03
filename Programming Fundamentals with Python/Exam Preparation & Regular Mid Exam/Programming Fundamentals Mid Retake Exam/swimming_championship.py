
days = int(input())
points_needed = int(input())
swimmers_count = int(input())
hotel_fee = float(input()) 
participation_fee = float(input())

points = 0
for i in range(days):
  points_today = float(input())
  points += points_today

  if i > 0:
    points += points_yesterday * 0.05

  points_yesterday = points_today

expenses = (days * swimmers_count * hotel_fee) + (swimmers_count * participation_fee)
if points >= points_needed:
  sponsor_coverage = expenses * 0.25
else:
  sponsor_coverage = expenses * 0.10

money_to_pay = expenses - sponsor_coverage

if points >= points_needed:
  print(f"Money left to pay: {money_to_pay:.2f} BGN.\nThe championship was successful!") 
else:
  print(f"Money left to pay: {money_to_pay:.2f} BGN.\nThe championship was not successful.")

