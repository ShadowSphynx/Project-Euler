import math
isAbundantList = [0]*10 + [-1]*100000

def isAbundant(N):
    divisors = []
    for i in range(2, math.floor(math.sqrt(N))+1):
        if N%i == 0:
            divisors.append(i)
            divisors.append(N//i)

    if sum(divisors) > N:
        isAbundantList[N] = 1
        return True
    else:
        isAbundantList[N] = 0
        return False

T = int(input())

for _ in range(T):
    N, counter = int(input()), 2
    if N >= 28123:
        print("YES")
    else:
        for i in range(2, N+1):
            if isAbundantList[i] == 1 and (isAbundantList[N-i] == 1 or isAbundant(N-i)):
                    break
            if isAbundantList[i] == -1 and isAbundant(i) and isAbundant(N-i):
                    break
            counter += 1
        for index in range(len(isAbundantList)):
            if isAbundantList[index] == 1:
                print(index)
        if counter == N+1:
            print("NO")    
        else:
            print("YES")

    print(*isAbundantList[:N])