
deposit = float(input())
months = int(input())
percent =float(input())

interest = deposit * (percent / 100)
interest_for_1_month = interest / 12
total = deposit + months * interest_for_1_month

print(total)