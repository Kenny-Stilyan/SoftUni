
def tribonacci_sequence(n):
    if n <= 0:
        return []
    elif n == 1:
        return [1]
    elif n == 2:
        return [1, 1]
    elif n == 3:
        return [1, 1, 2]

    sequence = [1, 1, 2]
    for i in range(3, n):
        next_number = sequence[i - 1] + sequence[i - 2] + sequence[i - 3]
        sequence.append(next_number)

    return sequence

def print_tribonacci_sequence(n):
    sequence = tribonacci_sequence(n)
    print(" ".join(str(num) for num in sequence))


n = int(input())
print_tribonacci_sequence(n)
