'''print("hello world")
a=30
b=7.8
c=3+4j
d='vimal'
e= True
print(a ,b ,c,d)
print(type(a),type(b),type(c),type(d),type(e))
# arithmetic operations
a=int(input("enter a number:"))
b=int(input("enter a number:"))
c=int(input("enter a number:"))
add=a+b+c
sub=a-b-c
multiply=a*b*c
division=a/b
rem=a%b
floor=a//b
print(add)
print(sub)
print(multiply)
print(division)
print(rem)
print(floor)
# logical operations
bool1=True
bool2=False
print("the value of bool1 and bool2 is",(bool1 and bool2))
print("the value of bool1 and bool2 is",(bool1 or bool2))
print("the value of bool1 and bool2 is",( not bool2))
# strings
a="vimal"
greeting="Good Morning"
# concatatenation
print(   greeting  +    a)
# string slicing
print(a[0:3])
print(greeting[0:10])
print(a[0:5:3])
# length of the string
print(len(a))
print(a.endswith('l'))
print(a.startswith('a'))
print(a.capitalize())
print(a.find('vimal'))
print(a.replace('vimal','vimal kumar'))'
# escape sequences characters 
story="Harry is good \n he is good"
s="Harry is good \t he is good"
st="Harry is good \' he is good"
sto="Harry is good \\ he is good"
print(story)
print(s)
print(st)
print(sto)

# lists and tuples
a=[1,3,2,5,4,7,0]
print(a[2])
print(a[6])
a[2]=8
print(a[2])
v=['vimal',4.5,3,8,9]
print(v)
# lists slicing
friends=['sai','vivek','shiva','umesh']
print(friends[0:4])
l1=[4,6,2,7,8,9]
l1.sort()# sort arrange the numbers in ascending order
print(l1)
l1.reverse()# reverse arrangement of the lists
print(l1)
l1.append(32)# Adding the last number in the lists
print(l1)
l1.insert(1,20)/
print(l1)
l1.pop(1)# removes from the list
print(l1)
l1.remove(9)
print(l1)
p=[9,20,6,98,1] 
p.remove(98)
print(p[0]+p[1]+p[2]+p[3])
print(sum(p))
# creating a tuple 
t=(1,3,5,8,9)
print(t[0])
print(t.count(1))
print(t.index(3))'
# dictonary and sets
myDict={
 "marks":34,
 "fast":"In a Quick manner",
 "name":"harry"
}
print(myDict['marks'])
print(myDict["name"])
print(myDict["fast"])
print(type(myDict.keys()))
print(type(myDict.values()))
print(type(myDict.items()))
print(myDict)
updateDict={
    "friend":"shiva",
    "plant":"mango tree"
}
myDict.update(updateDict)
print(myDict)
print(myDict.get("shiva"))# square bracket is not allowed i the dictonar
for y in range (10):
 for x in range (5,50,5):
                     print("5*",y)'''                   
for x in range(1,5):

    print  (x[x:[1]])            