arr = [0, 1, 2, 3, 4, 5, 6, 7]

odd = []
even = []


def sort_asc(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

def sort_desc(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] < arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

for i in arr:
    if i%2!=0:
        odd+=[i]
    else:
        even+=[i]

sort_asc(even)
sort_desc(odd)

print(even+odd)





    
