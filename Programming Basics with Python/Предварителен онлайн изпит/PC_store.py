
cpu = float(input())
gpu = float(input())
ram = float(input())
ram_quantity = int(input())
discount = float(input())

lev = 1.57

cpu_price = cpu * lev
gpu_price = gpu * lev
ram_price = (ram * lev)* ram_quantity

cpu_price_discount = cpu_price - (cpu_price * discount)
gpu_price_discount = gpu_price - (gpu_price * discount)

total = cpu_price_discount + gpu_price_discount + ram_price


print(f"Money needed - {total:.2f} leva.")








