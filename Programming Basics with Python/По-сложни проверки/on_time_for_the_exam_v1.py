
exam_hour = int(input())
exam_minutes = int(input())
arrive_hour = int(input())
arrive_minutes = int(input())


exam_hour_minutes = exam_hour * 60 + exam_minutes
arrive_hour_minutes = arrive_hour * 60 + arrive_minutes

difference = abs(exam_hour_minutes - arrive_hour_minutes)

difference_hour = difference // 60
difference_minutes = difference % 60


if exam_hour_minutes < arrive_hour_minutes:
    heis = 'Late'
    if difference_hour == 0:
        print(heis)
        print(f'{difference_minutes} minutes after the start')
    else: 
        print(heis)
        print(f'{difference_hour:.0f}:{difference_minutes:02d} hours after the start')

elif difference <= 30 :
    heis = 'On time'
    if  difference_hour == 0 and difference_minutes == 0:
        print(heis)
    else:
        print(heis)
        print(f'{difference_minutes} minutes before the start')


else:  #elif exam_hour_minutes > arrive_hour_minutes: 
    heis = "Early"
    if difference_hour == 0:
        print(heis)
        print(f'{difference_minutes} minutes before the start')
    else:
        print(heis)
        print(f'{difference_hour:.0f}:{difference_minutes:02d} hours before the start')



