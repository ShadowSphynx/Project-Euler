single_digit = {0: 'Zero', 1: 'One', 2: 'Two', 3: 'Three', 4: 'Four', 5: 'Five', 6: 'Six', 7: 'Seven', 8: 'Eight', 9: 'Nine'}
teen = {10: 'Ten', 11: 'Eleven', 12: 'Twelve', 13: 'Thirteen', 14: 'Fourteen', 15: 'Fifteen', 16: 'Sixteen', 17: 'Seventeen', 18: 'Eighteen', 19: 'Nineteen'}
tens = {20: 'Twenty', 30: 'Thirty', 40: 'Forty', 50: 'Fifty', 60: 'Sixty', 70: 'Seventy', 80: 'Eighty', 90: 'Ninety'}

def spell_single_digit(digit):
    if 0 <= digit < 10:
        return single_digit[digit]

def spell_two_digits(number):
    if 10 <= number < 20:
        return teen[number]

    if 20 <= number < 100:
        div = (number // 10) * 10
        mod = number % 10
        if mod != 0:
            return tens[div] + spell_single_digit(mod)
        else:
            return tens[number]

def spell_three_digits(number):
    if 100 <= number < 1000:
        div = number // 100
        mod = number % 100
        if mod != 0:
            if mod < 10:
                return spell_single_digit(div) + "Hundredand" +  \
                   spell_single_digit(mod)
            elif mod < 100:
                return spell_single_digit(div) + "Hundredand" + \
                   spell_two_digits(mod)
        else:
            return spell_single_digit(div) + "Hundred"

def spell(number):
    if number == 0:
        return spell_single_digit(number)
    a = ""
    loop = 0
    while number:
        mod = number % 1000
        if mod != 0:
            c = spell_three_digits(mod) or spell_two_digits(mod) \
                or spell_single_digit(mod)
            if loop == 0:
                a = c + a
            elif loop == 1:
                a = c + "Thousand " + a
            elif loop == 2:
                a = c + " Million " + a
            elif loop == 3:
                a = c + " Billion " + a
            elif loop == 4:
                a = c + " Trillion " + a             
        number = number // 1000
        loop += 1
    return a
    
counter = 0
for element in range(1, 1001):
    counter += len(spell(element).strip())
print(counter)