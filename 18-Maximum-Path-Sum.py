N = 0
def maxCost(cost, m, n):
    maxPathArray = [[0 for _ in range(N)] for _ in range(N)]

    maxPathArray[0][0] = cost[0][0]
    for i in range(1, m+1):
        maxPathArray[i][0] = maxPathArray[i-1][0] + cost[i][0]

    for i in range(1, n+1):
        maxPathArray[0][i] = maxPathArray[0][i-1] + cost[0][i]

    for i in range(1, m+1):
        for j in range(1, n+1):
            maxPathArray[i][j] = max( maxPathArray[i-1][j-1], maxPathArray[i-1][j] ) + cost[i][j]

    return maxPathArray[m][n]

T = int(input())
for _ in range(T):
    N = int(input())
    cost = []
    for i in range(N):
        cost.append(list(map(int, input().split())) + [0]*(N-i-1))

    print(max(maxCost(cost, N-1, i) for i in range(N)))