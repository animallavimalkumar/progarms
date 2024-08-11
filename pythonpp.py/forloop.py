'''for i in range(1,10):
    print(i);
    if i==8: 
        break
        #continue
else:
    print('good');    
n=input("enter any number:")
count=0
for i in range(1,n+1):
           if(n%i==0):
                    count=count+1
if(count==2):
           print("prime number:",n) 
else:
     print("not a prime number:",n)                                

# table program
number=int(input("enter the number:"))
for mul in range(1,11):
             print("{0}*{1}={2}".format(number,mul,(number*mul)))
'''
import calendar
year=int(input("enter a year to check for a leap year"))
result=calendar.isleap(year)
if(result):
    print("{0} is a leap year".format(year))
else:
    print("{0} is a not leap year".format(year))