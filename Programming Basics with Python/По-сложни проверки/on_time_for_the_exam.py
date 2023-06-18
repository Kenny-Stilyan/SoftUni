
exam_hour = int(input())
exam_min = int(input())
arrived_hour = int(input())
arrived_min = int(input())

exam_time = (exam_hour * 60) + exam_min
arrived_time = (arrived_hour * 60) + arrived_min
result = abs(exam_time - arrived_time)

if exam_time < arrived_time: #late
    converted_hour = result // 60
    converted_min = result % 60
    print("Late")
    if converted_hour == 0:
        print(f"{converted_min} minutes after the start")
    else:
        print(f"{converted_hour}:{converted_min:02d} hours after the start")
else: #on time OR early
    if result <= 30: #on time
        converted_min = result % 60
        print("On time")
        print(f"{converted_min} minutes before the start")
    else: #early
        converted_hour = result // 60
        converted_min = result % 60
        print("Early")
        if converted_hour == 0:
           print(f"{converted_min} minutes before the start") 
        else:
            print(f"{converted_hour}:{converted_min:02d} hours before the start" )

