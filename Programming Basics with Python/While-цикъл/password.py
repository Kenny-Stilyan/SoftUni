
username = input()
password = input()

input_pass = input()
while password != input_pass:
    input_pass = input()
    
print(f"Welcome {username}!")
    

"""
username = input()
password = input()

while True:
    input_pass = input()
    if password == input_pass:
        print(f"Welcome {username}!")
        break
"""
