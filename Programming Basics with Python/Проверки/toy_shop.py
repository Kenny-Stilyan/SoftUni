
trip_price = float(input())
puzzel = int(input())
dolls = int(input())
bears = int(input())
minion = int(input())
truck = int(input())

puzzel_price = puzzel * 2.60
dolls_price = dolls * 3
bears_price = bears * 4.10
minion_price = minion * 8.20
truck_price = truck * 2

total_sum = puzzel_price + dolls_price + bears_price + minion_price + truck_price
total_toys_num = puzzel + dolls + bears + minion + truck

if total_toys_num >= 50:
    discount = total_sum * 0.25
    total = total_sum - discount
    rent = total * 0.10
    profit = total - rent
else:
    total = total_sum
    rent = total * 0.10
    profit = total - rent

if profit >= trip_price:
    left_money = profit - trip_price
    print(f"Yes! {left_money:.2f} lv left.")
else:
    need_money = abs(trip_price - profit)
    print(f"Not enough money! {need_money:.2f} lv needed.")

    










