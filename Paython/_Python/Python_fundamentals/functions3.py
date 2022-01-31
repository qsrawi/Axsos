import re


def biggie_size(arr):
    for x in range(0,len(arr)):
        if arr[x] > 0:
            arr[x]="big"
    return arr
print(biggie_size([-1,-2,-3,5,7,8,-9]))

##############################################

def count_positive(arr):
    count=0
    for x in range(0,len(arr)):
        if arr[x] > 0:
            count +=1
    arr[len(arr)-1] = count
    return arr
print(count_positive([1,2,3,-2,-5]))

##############################################

def sum_total(arr):
    sum=0
    for x in range(0,len(arr)):
        sum +=arr[x]
    return sum
print(sum_total([1,2,3,4]))

##############################################

def avg_total(arr):
    sum=0
    avg=1
    for x in range(0,len(arr)):
        sum +=arr[x]
    avg = sum/len(arr)
    return avg
print(avg_total([1,2,3,4]))

##############################################

def length(arr):
    count=0
    for x in range(0,len(arr)):
        count +=1
    return count
print(length([1,2]))

##############################################

def minimum(arr):
    min=arr[0]
    for x in range(0,len(arr)):
        if arr[x]<min:
            min = arr[x]
    return min
print(minimum([37,2,1,-9]))

##############################################

def maximum(arr):
    max=arr[0]
    for x in range(0,len(arr)):
        if arr[x]>max:
            max = arr[x]
    return max
print(maximum([37,2,1,-9]))

##############################################

def ultimate_analysis(arr):
    print(f"sum total: {sum(arr)} average:{avg_total(arr)}, minimum: {minimum(arr)}, maximum: {maximum(arr)}, length: {length(arr)}")
ultimate_analysis([37,2,1,-9])

##############################################

def reverse_list(arr):
    count=len(arr)-1
    for x in range(0,len(arr)-3):
            temp=arr[x]
            arr[x]=arr[count]
            arr[count]=temp
            count -=1
    return arr
print(reverse_list([37,2,1,-9,5,6]))
