class Employee:
    def __init__(self):
        self.name = ""
        self.id = ""
        self.dept = ""
        self.salary = 0
    def getInfo(self):
        self.name = input("Enter Employee Name: ")
        self.id = input("Enter Employee_ID: ")
        self.dept = input("Enter the department: ")
        self.salary = int(input("Enter salary: "))
    def updateSalary(self):
        self.salary = int(input("\nEnter the updated salary: "))
    def display(self):
        print("\n------Employee Details------")
        print(f"Name: {self.name}\nEmployee_ID: {self.id}\nDepartment: {self.dept}\nSalary: {self.salary}")


e1 = Employee()
e1.getInfo()
e1.updateSalary()
e1.display()