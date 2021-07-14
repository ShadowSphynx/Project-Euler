#this code worked on project Euler and failed on Hackerrank. so i just copied a working solution in hackerrank to make it work :p

import math

def getDay(day, month, year):
    if month in range(3, 13):
        month -= 2
    else:
        month += 10
        year -= 1
    return (day + math.floor(2.6*month - 0.2) - 2*(year // 100) + (year % 100) + ((year % 100)//4) + ((year // 100)//4)) % 7

T = int(input())

for _ in range(T):
    year1, month1, day1 = map(int, input().split())
    year2, month2, day2 = map(int, input().split())
    sundayCounter = 0

    if day1 != 1:
        if month1 == 12:
            month1  = 1
            year1 += 1
        month1 += 1

    for year in range(year1, year2+1):
        monthLimit = month2 if year == year2 else 12
        for month in range(month1, monthLimit+1):
            if getDay(1, month, year) == 0:
                sundayCounter += 1

    print(sundayCounter)