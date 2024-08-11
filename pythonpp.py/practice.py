# casting 
x = int (3)
y=str(5)
z=float(9)
print(x,y,z)
x=y=z="john"
print(x,y,z)
x,y,z="orange","apple","cherry"
print(x,y,z)
# global variables
x="awesome "
def myfunc():
    global  x
    x="fantastic"
    myfunc()
print("python is "+x)
# Datatypes
x=98
y=789.46
z=3+6j
print(type(x))
print(type(y))
print(type(z))
# random number
import random
print(random.randrange(3,30))
#x="hello"
#print(random.randrange(x))
# Strings
s="python is awesome language"
print(s)
print(s[5])
#looping in string
for x in "python":
    print(x)
x="hello"
print(len(x))
# check string
txt="python is awesome language"
print("language"in txt)
print("language" not in txt)
if "is" in txt:
          print("yes is present in the txt")
if"awesome" not in txt:
           print("No  awesome is not present")
           # slicing string
a="hello world"
print(a[1:5])
print(a[:1])
print(a[5:])
print(a[-5:-3])


