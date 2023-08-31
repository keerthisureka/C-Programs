class PaliStr:
    def __init__(self):
        self.isPali = False
    def check(self, s):
        if s == s[::-1]:
            self.isPali = True
        else:
            self.isPali = False
        return self.isPali

class PaliInt(PaliStr):
    def __init__(self):
        self.isPali = False
    def check(self, n):
        temp = n
        rev = 0
        while temp > 0:
            dig = temp % 10
            rev = (rev*10) + dig
            temp //= 10
        if n == rev:
            self.isPali = True
        else:
            self.isPali = False
        return self.isPali

s = input("Enter a string: ")
sObj = PaliStr()
if sObj.check(s):
    print("Yes, it is a palindrome!")
else:
    print("No, it is not a palindrome!")

n = int(input("Enter a number: "))
nObj = PaliInt()
if nObj.check(n):
    print("Yes, it is a palindrome!")
else:
    print("No, it is not a palindrome!")

# Write a python program to find the whether the given input is palindrome or not (for both string and integer) using the concept of polymorphism and inheritance.
