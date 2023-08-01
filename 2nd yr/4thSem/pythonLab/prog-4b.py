import re

def validate_roman(rom):
    return bool(re.search(r'^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$', rom))

rom_val = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

def roman_to_int(s):
    val = 0
    for i in range(len(s)):
        if i>0 and rom_val[s[i]] > rom_val[s[i-1]]:
            val += rom_val[s[i]] - 2 * rom_val[s[i-1]]
        else:
            val += rom_val[s[i]]
    return val

s = input("Enter a roman number: ").upper()
if validate_roman(s):
    val = roman_to_int(s)
    print("Integer value of ", s, " is ", val)
else:
    print("Invalid roman numeral!")