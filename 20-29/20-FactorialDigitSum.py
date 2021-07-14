def sumDigits(number):
    sum = 0
    while number != 0:
        sum += number % 10
        number //= 10
    return sum

def getHighestSave(N, saves):
    for i in range(N, -1, -1):
        if saves[i] != 0:
            return i
    return 0

T = int(input())
factorialSaves = [0] * 1000

for _ in range(T):
    N, factorial = int(input()), 1

    if factorialSaves[N] == 0:
        maxSave = getHighestSave(N, factorialSaves)
        factorial = 1 if factorialSaves[maxSave] == 0 else factorialSaves[maxSave]

        for i in range(maxSave+1, N+1):
            factorial *= i
            factorialSaves[i] = factorial
        
        print(sumDigits(factorial))

    else:
        print(sumDigits(factorialSaves[N]))