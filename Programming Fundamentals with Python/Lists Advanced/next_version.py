
version = [num for num in input().split(".")]
num_version = int(''.join([str(i) for i in version])) + 1
str_version = str(num_version)

if len(str_version) >= 4:
    str_version = "000"

print(".".join(str_version))

