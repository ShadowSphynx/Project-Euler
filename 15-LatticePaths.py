from math import factorial

tc = int(input())
for i in range(tc):
    m, n = map(int, input().split(" "))
    print((factorial(m + n) // (factorial(m) * factorial(n))) % 1000000007)