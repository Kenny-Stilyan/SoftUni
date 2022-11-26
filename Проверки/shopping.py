
buget = float(input())
gpu = int(input())
cpu = int(input())
ram = int(input())

gpu_price = gpu * 250
cpu_price = cpu * (gpu_price * 0.35)
ram_price = ram * (gpu_price * 0.10)
total_sum = gpu_price + cpu_price + ram_price

if gpu > cpu:
    discount = total_sum * 0.15
    total_sum -= discount

if total_sum <= buget:
    buget -= total_sum
    print(f"You have {buget:.2f} leva left!")
else:
    buget -= total_sum
    print(f"Not enough money! You need {abs(buget):.2f} leva more!")






