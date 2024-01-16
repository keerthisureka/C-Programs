n = int(input())
k = int(input())
l = []

for _ in range(n):
    l.append(int(input()))

res = []
for ele in l:
    if list(set(str(ele)))[0] == str(k) and len(set(str(ele))) == 1:
        res.append('')
    else:
        res.append(int(''.join([el for el in str(ele) if int(el) != k])))

print(str(res))
