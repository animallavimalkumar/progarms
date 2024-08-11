'''name=input("enter name:")
address=input("enter address:")
email=input("enter email:")
phone= input("phone number:")
print(name)
print(address)
print(email)
print(phone)
a=43+2j
print(type(a))

letter =input("enter a character:")
if(letter>='A'and letter<='Z'):
               print("Capital letter")
elif(letter>='a'and letter<='z'):
                    print("Small Letter")
elif(letter >='0' and letter<='9'):
                     print("digit")
else:
    print("not a character ")                                                        

n= int (input("enter n value :"))
count=0
for i in range (1,n+1):
      if(n%i==0):
                count=count+1
if(count==2):
            print("the number is prime ")
else:
     print("not a prime number")                            
x= list (range(20,0,-2))
print(x)

math= int(input("enter maths marks:"))
phy= int(input("enter phy marks:"))
chem= int(input("enter chem marks:"))
python= int(input("enter python marks:"))
bee= int(input("enter bee marks:"))
total= math+phy+chem+python+bee
avg=total/5
print("total:",total)
print("avg:", avg)
if(avg>=60):
          print("First rank")
elif(avg>=50):
          print("Second rank")
elif(avg>=40):
          print("Third rank")
elif(avg>=35):
          print("Pass")          
else:
     print("Fail")
list1=["swapna",18,"hyt","Gnit",68]
print(list1[2])
print(list1[0:5:2])
print(list1[-5:5])
list="swapna"
print(list[-6:6])'''
list2=[1,2,3,4,5,6]
list2.insert(2,'G')
print(list2)
list=[10,20,30,40,50,70]
list.append(40)
list.remove(20)
list.reverse()
print(list)
l1=[1,2,3,4,5]
l1.clear()
print(l1)
l2=[6,7,8,9,10]
print(l1*2)
print(l1+l2)
l=[]
l.pop(2)
#print(l)