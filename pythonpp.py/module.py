person1={
    "name":"feona",
    "age":12,
    "country":"India"
}
import module
a=module.person1["age"]
print(a)
import platform
x=platform.system()
print(x)
#y=dir(platform)
#print(y)
# date time
import datetime
x=datetime.datetime.now()
print(x)
print(x.year)
print(x.strftime("%A"))
x=datetime.datetime(2023,12,25)
print(x.strftime("%A"))








