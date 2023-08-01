# bin to dec
def btod(n):
    i = res = 0
    while n>0:
        dig = n % 10
        res += dig * (2 ** i)
        i += 1
        n = n // 10
    return res

num = int(input("Enter a binary number: "))
a = num
flag = 1
while a > 0:
    dig = a % 10
    if dig != 0 and dig != 1:
        flag = 0
    a = a // 10
if flag == 1:
    print("Decimal value of", num, "is", btod(num))
else:
    print("Invalid Input!")

# oct to hex
num = int(input("Enter an octal number: "))
a = num
flag = 1
while a > 0:
    dig = a % 10
    if dig < 0 or dig > 7:
        flag = 0
    a = a // 10
if flag == 1:
    dec = int(str(num), 8)
    print("Hexadecimal value of", num, "is", hex(dec))
else:
    print("Invalid Input!")

# Develop a python program to convert binary to decimal, octal to hexadecimal using functions.
