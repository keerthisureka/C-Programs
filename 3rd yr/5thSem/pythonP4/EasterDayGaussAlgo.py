import math
Y = int(input())
A = Y % 19
B = Y % 4
C = Y % 7

P = math.floor(Y / 100)
Q = math.floor((13 + 8*P) / 25)

M = (15 - Q + P - (P/4)) % 30
N = (4 + P - (P/4)) % 7

D = (19*A + M) % 30
E = (N + 2*B + 4*C + 6*D) % 7
days = int(22 + D + E)

if ((D == 29) and (E == 6)):
    print("April 19")
elif ((D == 28) and (E == 6)):
    print("April 18") 
else:
    if (days > 31):
        print("April", (days - 31)) # or print("April", (D + E - 9))
     
    else:
        print("March", days) # or print("March", (D + E + 22))
