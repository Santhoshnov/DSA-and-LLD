arr1 = [2, 2, 7, 5, 3, 3]
arr2 = [4, 3, 3, 8]

str1 = ""
str2 = ""

for i in arr1:
    str1+= str(i)

for i in arr2:
    str2+= str(i)

res = int(str1) + int(str2)

output=[]

for i in str(res):
    output+=[int(i)]

print(output)