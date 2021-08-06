def nameScore(name):
    score = 0
    for char in name:
        score += ord(char)- 64
    return score

N = int(input())
nameArray, scoreDict = [], {}

for _ in range(N):
    nameArray.append(input())

nameArray.sort()
counter = 1
for name in nameArray:
    scoreDict[name] = nameScore(name) * counter
    counter += 1

Q = int(input())

for _ in range(Q):
    print(scoreDict[input()])