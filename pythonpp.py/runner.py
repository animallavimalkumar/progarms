n = int(input())
arr=[]
for i in range(n):
    arr=int(input())

arr.sort(reverse=True)
for i in range(n):
    if arr[i]>arr[i+1]:
        print(arr[i+1])
        break