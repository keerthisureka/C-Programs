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