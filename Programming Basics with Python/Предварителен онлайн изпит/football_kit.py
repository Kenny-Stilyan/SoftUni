
shirt = float(input())
neaded_sum = float(input())

shorts = shirt * 0.75
soacks = shorts * 0.20
shoes = (shirt + shorts)* 2

sum = shirt + shorts + soacks + shoes
sum_discount = sum - (sum * 0.15)

if sum_discount >= neaded_sum:
    print("Yes, he will earn the world-cup replica ball!")
    print(f"His sum is {sum_discount:.2f} lv.")

else:
    sum_needs = neaded_sum - sum_discount
    print("No, he will not earn the world-cup replica ball.")
    print(f"He needs {sum_needs:.2f} lv. more.")
