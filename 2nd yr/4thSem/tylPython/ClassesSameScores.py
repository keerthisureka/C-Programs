n1, m11, m12, m13 = input().split()
n2, m21, m22, m23 = input().split()

class Student:
    def __init__(self, n, m1, m2, m3):
        self.name = n
        self.m1 = m1
        self.m2 = m2
        self.m3 = m3
    def display(s, c):
        if s.m1 == c.m1 and s.m2 == c.m2 and s.m3 == c.m3:
            print("Same scores in all subjects!")
        else:
            print("Not same scores in all subjects!")
            
s = Student(n1, m11, m12, m13)
c = Student(n2, m21, m22, m23)
s.display(c)

# Input: A 23 45 67
#        B 23 45 67
# Output: Same scores in all subjects!
