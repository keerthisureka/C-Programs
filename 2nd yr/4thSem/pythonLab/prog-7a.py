import math
class Shape:
    def __init__(self):
        self.area = 0
        self.name = ""
    def showArea(self):
        print(f"The area of {self.name} is {self.area}")

class Circle(Shape):
    def __init__(self, radius):
        self.area = 0
        self.name = "Circle"
        self.radius = radius
    def calcArea(self):
        self.area = math.pi * self.radius ** 2

class Triangle(Shape):
    def __init__(self, base, height):
        self.area = 0
        self.name = "Triangle"
        self.base = base
        self.height = height
    def calcArea(self):
        self.area = self.base * self.height / 2

class Rectangle(Shape):
    def __init__(self, length, breadth):
        self.area = 0
        self.name = "Rectangle"
        self.length = length
        self.breadth = breadth
    def calcArea(self):
        self.area = self.length * self.breadth


c1 = Circle(5)
c1.calcArea()
c1.showArea()

t1 = Triangle(5, 3)
t1.calcArea()
t1.showArea()

r1 = Rectangle(5, 10)
r1.calcArea()
r1.showArea()

# By using the concept of inheritance write a python program to find the area of triangle, circle and rectangle
