import re

def isphonenumber(s):
    return bool(re.search(r'^(\d{3})-(\d{3})-(\d{4})$', s))


s = input("Enter a phone number: ")
if isphonenumber(s):
    print("Valid phone number!")
else:
    print("Invalid phone number!")