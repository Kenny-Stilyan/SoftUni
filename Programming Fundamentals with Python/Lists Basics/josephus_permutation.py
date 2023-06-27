
def josephus_permutation(people, k):
    result = []
    circle = list(map(int, people.split()))
    index = 0
    
    while circle:
        index = (index + k - 1) % len(circle)
        executed = circle.pop(index)
        result.append(executed)
    
    return result


people = input()
k = int(input())

permutation = josephus_permutation(people, k)
output = str(permutation).replace(" ", "")
print(output)
