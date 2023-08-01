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