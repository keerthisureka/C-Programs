n = input("Enter a number: ")
rev = n[::-1]
d = {}
if n == rev:
    print("Palindrome!")
else:
    print("Not Palindrome!")

for i in n:
    d[i] = n.count(i)
print("Frequency of each number: ", d)

# Develop a Python program to check whether a given number is palindrome or not and also count the number of occurrences of each digit in the input number.
