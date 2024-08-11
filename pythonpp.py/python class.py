class MyClass:
 def __init__(self,name,age) :
  self.name=name
  self.age=age
 def myfunc(self):
    print("hello friends my name is " +self.name)
    #print("and mine age is"+self.age) 
p1=MyClass('Suresh',36)
p1.myfunc()
#print("Name:",p1.name)
#print("Age:",p1.age)