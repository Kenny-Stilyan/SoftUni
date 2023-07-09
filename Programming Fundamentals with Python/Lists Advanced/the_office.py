
def check_employee_happiness():
    happiness_list = list(map(int, input().split(" ")))
    happiness_factor = int(input())

    improve_happiness = [i * happiness_factor for i in happiness_list]

    average_happiness = sum(improve_happiness) / len(improve_happiness)
    happy_count = sum(i >= average_happiness for i in improve_happiness)
    total_count = len(improve_happiness)

    message = "happy" if happy_count >= total_count / 2 else "not happy"

    return f"Score: {happy_count}/{total_count}. Employees are {message}!"

result = check_employee_happiness()
print(result)
