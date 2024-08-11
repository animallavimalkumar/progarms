'''celsius=float(input("enter a temperature in celsius:"))
fahrenhiet=(celsius*1.8)+32
print("temperature in fahrenhiet is:",fahrenhiet)
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
     print(num,"is a armstrong number")
else:
     print(num,"is not a armstrong number")
nums=[1,2,3,2,4,5,1,6,7,8,6]
unique_nums=[]
for num in nums:
    if num not in unique_nums:
        unique_nums.append(num)
print("list after removing duplicates:",unique_nums)'''
'''Write a program reverse a string
string = input("Enter a string")
reverse = string[::-1]
print("Reverse of the string :",reverse)
Palidrome
def is_palindrome(s):
    if len(s)<2:
        return True
    elif s[0]!=s[-1]:
         return False
    else:
            return is_palindrome(s[1:-1])

string = input("Enter a string:")
if is_palindrome(string):
        print(string,"is a palindrome.")
else:
      print(string,"is not a palindrome.")
smalles element
nums=[10,20,30,40,50]
min=nums[0]
for num in nums:
    if num<min:
        min=num
print("Smallest element in the list:",min)
largest
nums=[10,20,30,40,50]
max=nums[0]
for num in nums:
    if num>max:
        max=num
print("Largest element in the list:",max)
Sum
nums=[10,20,30,40,50]
sum=0
for num in nums:
    sum+=num
print("Sum of elements in the list :",sum)
multipication table
num=int(input("Enter  a number:"))
for i in range(1,11):
 print(num,"x",i,"=",num*i)
 secondlargest
nums=[10,20,4,45,99]
nums.sort()
print("Second largest number is:",nums[-2])
string = input("enter a string :")
vowels="aieouAEIOU"
count=0
for char in string :
  if char in vowels:
        count+=1
print("Number of vowels:",count)    
string=input("enter a string :")
if string==string[::-1]:
    print(string,"is a palindrome" )
else:
    print(string,"is not a palindrome")    
n=int(input("enter a number of terms:"))
a,b=0,1
count=0
if n<0:
    print("please enter a positive integer  ")
elif n==1:
    print("fibonacci sequence")
    print(a)
else:
    print("fibonacci series:")  
    while count<n:
         print(a)
         c=a+b
         a=b
         b=c
         count+=1
n=int(input("enter a number:"))
count=0
for i in range(1,n+1):
    if(n%i==0):
        count=count+1
if(count==2):
    print(n,"is a prime number")
else:
    print(n ,"is not  a prime number")
n=int(input("enter a number:"))
fact=1
for i in range(1,n+1):
    fact=fact*i
print("the factorial of",n,"is",fact)
num=int(input("enter a number:"))
if(num>0):
    print(num,"is positive number")
elif(num==0):
    print(num)
else:
    print(num,"is negative number")
num1=int(input("enter a number:"))
num2=int(input("enter a number:"))
num3=int(input("enter a number:"))
if(num1>num2 and num1>num3):
    print(num1,"is the greatest number")
elif(num2>num3 and num2>num1):
    print(num2,"is the greatest number")
elif(num3>num1 and num3>num2):
    print(num3,"is the greatest number")
else:
    print("invalid number")'''
nums=[10,20,30,40,50]
sum=0
for num in nums:
    sum+=num
print("sum:",sum)