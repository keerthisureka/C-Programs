def permutation(str1, i, n, p):
    global min1, _count
    if i==n:
        str1 = "".join(str1)
        q = int(str1)
        if q-p > 0 and q < min1:
            min1 = q
            _count = 1
    else:
        for j in range(i, n+1):
            str1[i], str1[j] = str1[j], str1[i]
            permutation(str1, i+1, n, p)
            str1[i], str1[j] = str1[j], str1[i]
    return min1
    
s = input()
A, B = map(int, s.split())

str2 = str(A)
str1 = [i for i in str2]
l = len(str1)

min1 = 10 ** 9
_count = 0

h = permutation(str1, 0, l-1, B)
if _count == 1:
    print(h)
else:
    print(-1)
