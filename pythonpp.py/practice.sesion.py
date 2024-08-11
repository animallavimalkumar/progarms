'''c="Hello"
print(c)
print(c.lower())
print(c.upper())
print(c.capitalize())
print(c.center(30))
print(c.casefold())
print(c.count("H"))
print(c.encode())
print(c.endswith("o"))
print(c.expandtabs(98))
print(c.find("e"))
print(c.index("e"))
print(c.isalnum())
print(c.islower())
c="        he is awesome and he is very cute and he had good smile      "
print(c.strip())
c="Hello my age is {}"
print(c.format(45))
# looping through a string
for x in "python":
      print(x)

# bool
age =input("enter his age :")
if age==18:
        print("true")
else:
     print("false")
#Arithmetic operators
a=int(input("Enter any number:"))
b=int(input("Enter any number:"))
sum=a+b
sub=a-b
multi=a*b
div=a/b
floordivsion=a//b
rem=a%b
power=a**b
neg=a^b
shiftleft=a>>b
rightshift=a<<b
print(sum)
print(sub)
print(multi)
print(div)
print(floordivsion)
print(rem)
print(power)
print(neg)
print(shiftleft)
print(rightshift)
#comparsion operators
rank=int(input("enter any rank:"))
#if(rank==3500):
 #     print("Excellent Rank")
      #if(rank!=1000):
       #            print("Better luck next time")
if(rank<1000):
                                print("Good Rank")
                                if(rank<100000):
                                           print("work hard for next time")
                                           if(rank>=500):
                                                       print("super rank")
                                                       if(rank<=500):
                                                                  print("Amazing Rank")'''
# logical operators
'''year=int(input("enter any year:"))
if(year%400==0 or year%4==0 and year%100!=0):
                                print("leap year")
else:
    print("not a leap year")
# by using or  operators
rank=int(input("enter any rank:"))
if(rank==3500 or rank<1000):
                   print("good rank")
else:
    print ("better luck next time")
# logical not opeators
rank=int(input("enter any rank:"))
if(not(rank<10000 and rank<500)):
                                 print("better luck next time")
else:
    print("work hard more bro")
# string conctenation
a="python"
print(len(a))
b=" is "
c="awesome language"
d=a+b+c
print(d.capitalize())
#list
list=["apple","banana","cheery","sapota"]
print(list)
print(list[1])
print(list[1:3])
print(list[-2])
print(list[::1])
print(list[3::])
print(len(list))
list[1]="blackcurrent"
print(list)
list.insert(2,'watermelon')
list.append("orange")
print(list)
vegetables=["tomato","brinjal","onion","potato"]
list.extend(vegetables)
print(list)
list.remove("blackcurrent")
print(list)
list.clear()
print(list)
# loop through the list 
list=[1,2, 3,4, 5, 6,18]
for x in list:
         print(x)
i=0
while i<len(list):
    print(list[i])
    i=i+1
newlist=[x for x in vegetables if "a" in x]
print(newlist)
updatelist=[ x for x in range(10)] 
print(updatelist)
updatelist.reverse()
print(updatelist)
number=list.copy()
print(number)
list3=list+vegetables
print(list3)'''
  #  tuples metheds by using the programs
players=("virat",'Dhoni', 'sachin tendulkar','burma','suryakumaryadav')
print(players)
print(players[1])
print(type(players))
print(len(players))
# tuple constructor 
names=tuple(("shiva","sai",'ramu',"shyam"))
print(names)
print(names. count())






















