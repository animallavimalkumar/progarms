'''num=int(input('enter a number'))
for i in range(1,11):
    print(f"{num}X{i}={num*i}")
    print(f"{num}*{i}={num*i}")'''
    # star pattern  by using python
n=3
for i in range(3):
        print(""*(n-i-1),end="")
        print("*"*(2*i+1),end="")
        print(""*(n-i-1))