
group_num = int(input())

sum_people = 0
m1 = 0
m2 = 0
m3 = 0
m4 = 0
m5 = 0
for i in range(1, group_num+1):
    people_group_num = int(input())
    sum_people += people_group_num

    if people_group_num  <= 5: # Мусала
        m1 += people_group_num
    elif people_group_num <= 12: # Монблан
        m2 += people_group_num
    elif people_group_num <= 25: # Килиманджаро
        m3 += people_group_num
    elif people_group_num <= 40: # К2
        m4 += people_group_num
    elif people_group_num > 40: # Еверест
        m5 += people_group_num

percent_m1 = (m1/sum_people)* 100
percent_m2 = (m2/sum_people)* 100
percent_m3 = (m3/sum_people)* 100
percent_m4 = (m4/sum_people)* 100
percent_m5 = (m5/sum_people)* 100

print(f"{percent_m1:.2f}%")
print(f"{percent_m2:.2f}%")
print(f"{percent_m3:.2f}%")
print(f"{percent_m4:.2f}%")
print(f"{percent_m5:.2f}%")

