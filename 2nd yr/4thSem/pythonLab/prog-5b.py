import re

mytext = open('data.txt').read()
print(mytext)
print("The matches found are: ")

phoneRegex = re.compile(r'\+\d{12}')
phones = re.findall(phoneRegex, mytext)
print(phones)

emailRegex = re.compile(r'([a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+[\.a-zA-Z]{2,4})')
emails = re.findall(emailRegex, mytext)
print(emails)