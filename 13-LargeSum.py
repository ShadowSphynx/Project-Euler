import math
s = [int(input()) for i in range(int(input()))]
print(int(sum(s)//math.pow(10, len(str(sum(s)))-10)))