

destination = input()
budget = int(input())
sum_input = int(input())

sum = 0
while destination != "End":
    sum += sum_input
    if sum >= budget:
        print(f"Going to {destination}!")
        sum = 0
        destination = input()
        if destination == "End":
            break

        budget = int(input())
        sum_input = int(input())
    else:
        sum_input = int(input())

