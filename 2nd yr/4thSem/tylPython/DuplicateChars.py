l = input()
s = [i for i in l]
flag = 0
for i in range(len(s)):
    c = 1
    for j in range(i+1, len(s)):
        if s[i] == s[j] and s[j] != ' ' and s[j] != 0:
            c += 1
            s[j] = 0
            flag = 1
    if c>1:
        print(s[i], end=" ")

if flag != 1:
    print("There are no duplicates in the string!")

# Write a python program to find all duplicate characters in a given string. If there are no duplicates, print there are no duplicate characters in a string.
