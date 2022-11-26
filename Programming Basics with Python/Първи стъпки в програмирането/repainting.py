
nailon = int(input())
paint = int(input())
diluent = int(input())
hours = int(input())
bag = 0.40

sum_nailon = (nailon + 2)* 1.50
sum_paint = (paint + 1.10)* 14.50   # 110/100 = 1.10%
sum_diluent = diluent * 5

sum_materials = sum_nailon + sum_paint + sum_diluent + bag
sum_work = (sum_materials * 0.30)* hours
total = sum_materials + sum_work

print(total)