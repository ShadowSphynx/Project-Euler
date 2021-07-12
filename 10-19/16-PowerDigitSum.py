T = int(input())

for i in range(T):
    powerOutput = str(pow(2, int(input())))
    output = 0
    for element in powerOutput:
        output += int(element)
    print(output)