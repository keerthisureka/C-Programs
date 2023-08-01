import difflib
s1 = input("Enter string 1: ")
s2 = input("Enter string 2: ")
match = difflib.SequenceMatcher(a=s1.lower(), b=s2.lower())
print("String Similarity: ", match.ratio())