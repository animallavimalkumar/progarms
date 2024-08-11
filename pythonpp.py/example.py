def reverse_array(arr):
    return arr[::-1]

N = int(input())

arr = []
for i in range(N):
    element = int(input())
    arr.append(element)

reversed_arr = reverse_array(arr)
print(reversed_arr)
