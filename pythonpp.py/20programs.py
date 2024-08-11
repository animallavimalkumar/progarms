'''celsius=float(input("enter temperature in celsius:"))
fahrenheit=(celsius*1.8)+32
print("temperature in fahrenheit:",fahrenheit)
def gcd(num1,num2):
  if num2==0:
     return num1
  else:
   return gcd(num2,num1%num2)
num1=int(input("enter first number:"))
num2=int(input("enter second number:"))
print("GCD of",num1,"and",num2, "is" ,gcd(num1,num2))
num=int(input("enter  a number:"))
order=len(str(num))
sum=0
temp=num
while temp>0:
    digit=temp%10
    sum+=digit**order
    temp//=10
if num==sum:
        print(num,"is an Armstrong Number:")
else:
     print(num , "is  not an Armstrong Number:")
print("hello world")
num1=int(input("enter a number:"))
num2=int(input("enter another number:"))
sum=num1+num2
print("sum of the",num1,"and",num2,"is:",sum )
num1=int(input("enter first number:"))
num2=int(input("enter second  number:"))
num3=int(input("enter  third number:"))
if(num1>num2 and num1>num3):
    print(num1 ,"is the largest number ")
elif(num2>num1 and num2>num3):
    print(num2,"is the largest number ")
elif(num3>num2 and num3>num1):
    print(num3 ,"is the largest number ")
num=int(input("enter a number:"))
if(num>0):
    print("postive number:",num)
else:
    print("negative number:",num)
num=int(input("enter  a number:"))
fact=1
for i in range (1,num+1):
    fact=fact*i
print("the factorial of",num,"is",fact)
string=input("enter a string :")
if string==string[::-1]:
    print(string,"is a palindrome ")
else:
    print(string,"is not a plaindrome")
string=input("enter a string:")
vowels="aeiouAEIOU"
count=0
for char in string :
    if char in vowels:
        count+=1
print("number of vowels:",count)
nums=[10,20,30,45,99]
nums.sort()
print("second largest number:",nums[-2])
num=int(input("enter a number"))
for i in range(1,11):
    print(num,"*",i,"=",num*i)'''
string=input("enter a string:")
reverse=string[::-1]
print("reverse of the string:",reverse)
