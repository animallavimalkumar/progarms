''' inheritance
Inheritance allows us to define a class
that inherits all tḥe methids and properties
from anoher class'''
class person:
    def __init__(self,fname,lname) :
        self.firstname=fname
        self.lastname=lname
    def printname(self):
        print("My full name is",self.firstname,self.lastname)
x=person('Vimal', 'Kumar')
x.printname()
mytuple=("apple","banana","cherry")
myit=iter(mytuple)
print(next(myit),next(myit),next(myit))
for x in mytuple:
    print(x)
    
