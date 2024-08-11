'''a=12
b=4.7375
c='vimal'
print(a,b)
print(type(a))
print(type(b))
print(type(c))
if(a<1):
       print(bool(a))
else:
    print(bool(a))'
#using input  function
a=int (input("enter a number:"))
b=int(input("enter a number:"))
c=int(input("enter a number:"))
d=int(input("enter a number:"))
sum =a+b+c+d
sub= a-b-c-d
multi=a*b*c*d
div=a/b/c/d
rem=a%b
floor=a//b
print("sum:",sum)
print("sub:",sub)
print("multi:",multi)
print("div:",div)
print("rem:",rem)
print("floor:",floor)''
 # program to print name and adress 
name=input("Enter your Name:")
age=input("Enter your Age:")
Qualification=input("Enter your Qualification:")
address=input("Enter your Address:")
MobileNumber=input("Enter your Mobile Number:")
Signature=input("Enter your Signature:")
print("--------------------My Details---------------")
print(name)
print(age)
print(Qualification)
print(address)
print(MobileNumber)
print(Signature)'
# string chapter
name="amazing"
print(name)
print( "length:",len(name))
#string slicing 
print(name[0:6])
print(name[1:5:2])
# string function
lens="harry"
print(len(lens))
print(lens.capitalize())
print(lens.endswith("rry"))
print(lens.count("a"))
print(lens.find("harry"))
print(lens.replace("harry","vimal"))
# escape sequences
\n- new line 
\t- tab
\'- single quote
\\- Backslash

name= "vimal is good boy   \nhe is very nice person "
print(name)
print(name.capitalize())
print(name.endswith("v"))
print(name.count("i"))
print(name.replace("vimal","vimal kumar"))
print(name.find("i"))
print(len(name))
# lists and tuples
# Lists
friends=['ravi','shyam','suresh','harry']
print(friends)
print(type(friends))
# list indexing 
print(friends[0])
print(friends[1])
print(friends[0:2])'''
l1=[1,7,8,31,56,2,2]
print(l1)
#print(len(num))
#print(num,type(num))
l1.sort()
print(l1)
l1.reverse()
print(l1)
l1.append(0)# adding a number at last
print(l1)
l1.insert(9,6)
print(l1)
l1.pop(2)
print(l1)
l1.remove(56)
print(l1)
# tuples 
a=(1,4,7,20,1,3)
print(a.count(4))
print(a.index(7))
print(a,type(a))
print(a[1])
print(a[1:3])
# dictonary and sets
myDict={
    "key":"Value",
    "harry":"coder",
    "marks":98,
    "list":[1,7,9]
}
print(myDict.keys())
print(myDict.values())
print(myDict.items())
print(myDict())

