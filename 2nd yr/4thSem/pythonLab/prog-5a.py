def isphonenumber(s):
    if len(s) != 12:
        return False
    if s[3] != '-' or s[7] != '-':
        return False
    l = s.replace('-', '')
    for i in l:
        if not i.isdigit():
            return False
    return True

s = input("Enter a phone number: ")
if isphonenumber(s):
    print("Valid phone number!")
else:
    print("Invalid phone number!")