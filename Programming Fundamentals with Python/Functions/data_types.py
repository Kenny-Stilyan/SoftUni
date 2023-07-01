
def data_type(type_str, str_input):
    if type_str == "int":
        return int(str_input) * 2
    elif type_str == "real":
        return f"{float(str_input) * 1.5:.2f}"
    elif type_str == "string":
        return f"${str_input}$"


type_str = input()
str_input = input()

result = data_type(type_str, str_input)
print(result)
