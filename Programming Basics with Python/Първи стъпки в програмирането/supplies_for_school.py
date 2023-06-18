
pen = int(input())
markers = int(input())
cleaner = int(input())
percent = int(input())

sum_pen = pen * 5.80
sum_markers = markers * 7.20
sum_cleaner = cleaner * 1.20

total_sum = sum_pen + sum_markers + sum_cleaner
discount_sum = total_sum * (percent / 100)
total = total_sum - discount_sum

print(total)