s = input("Enter a sentence: ")
d = uc = lc = 0
for i in range(len(s)):
    if s[i].isdigit():
        d += 1
    if s[i].isupper():
        uc += 1
    if s[i].islower():
        lc += 1

l = s.split()
print("Number of words: ", len(l))
print("Number of digits: ", d)
print("Number of uppercase letters: ", uc)
print("Number of lowercase letters: ", lc)