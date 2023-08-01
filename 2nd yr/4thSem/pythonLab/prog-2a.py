def fibo(n):
    if n == 1:
        return 0
    if n == 2:
        return 1
    return fibo(n-1) + fibo(n-2)

n = int(input("Enter a number: "))
if n <= 0:
    print("Invalid Input!")
else:
    print("Fibonacci number at position", n, "in the series is", fibo(n))

# Defined as a function F as Fn = Fn-1 + Fn-2. Write a Python program which accepts a value for N (where N>0) as input
# and pass this value to the function. Display suitable error message if the condition for input value is not followed.
