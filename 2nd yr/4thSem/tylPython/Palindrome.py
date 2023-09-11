def is_palindrome(s):
    if s==s[::-1]:
        return True
    else:
        return False
        
user_input = input()
print(is_palindrome(user_input))

# Check palindrome or not using user-defined function and print True or False.
