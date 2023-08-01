a = int(input("Enter first test marks: "))
b = int(input("Enter second test marks: "))
c = int(input("Enter third test marks: "))
tot = a + b + c
avg = (tot - min(a, b, c))/2
print("Average of best two test marks: ", avg)