import os.path
import sys

fname = input("Enter the filename: ") # In the format: "data.txt"
if not os.path.isfile(fname):
    print("File", fname, "doesn't exist")
    sys.exit(0)

n = int(input("Enter number of lines: "))
with open(fname, 'r') as f:
    linelist = f.readlines()
    for i in range(n):
        print(i+1, ":", linelist[i], end="")

word = input("Enter the word whose occurrence is to be counted: ")
c = 0
for line in linelist:
    c += line.count(word)
print("The word", word, "occurs", c, "times in the file")

# Write a python program to accept a file name from the user and perform the following operations:
# 1. Display the first N lines of the file
# 2. Find the frequency of occurrence of the word accepted from the user in the file
