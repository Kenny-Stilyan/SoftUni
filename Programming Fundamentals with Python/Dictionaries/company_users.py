
command = input().split(" -> ")

company_dict = {}
while command[0] != "End":
    company_name, ids = command[0], command[1]

    if company_name not in company_dict.keys():
        company_dict[company_name] = []
    if ids not in company_dict[company_name]:
        company_dict[company_name].append(ids)

    command = input().split(" -> ")

for company, ids in company_dict.items():
    print(f"{company}")
    for identification in ids:
        print(f"-- {identification}")
