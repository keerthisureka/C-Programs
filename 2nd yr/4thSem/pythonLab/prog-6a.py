import os.path
import sys

fname = input("Enter the filename: ")
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