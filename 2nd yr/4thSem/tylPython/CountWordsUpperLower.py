s = input()
l = s.split(" ")
digits, upper, lower = 0, 0, 0
words = len(l)
for c in s:
    if c.isdigit():
        digits +=1 
    elif c.isupper():
        upper += 1
    elif c.islower():
        lower += 1
        
print("Words:", words, "\nDigits:", digits, "\nUppercase:", upper, "\nLowercase:", lower)

# To print number of words, uppercase and lowercase letters in a string.
