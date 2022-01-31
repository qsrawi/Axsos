def Countdown(input):
    mylist=[]
    for x in range(5,-1,-1):
        mylist.append(x)
    return mylist
print(Countdown(5))

####################################

def Print_and_return(num1,num2):
    print(num1)
    return num2
print(Print_and_return(5,100))

####################################

def first_length_plus(arr):
    return arr[0]+len(arr)
print(first_length_plus([2,3,4,5,6,7,8]))

####################################

def values_greater_than_second(arr):
    newlist=[]
    for x in range(0,len(arr)):
        if arr[x] > arr[1]:
            newlist.append(arr[x])
    return newlist
print(values_greater_than_second([1,5,6,7,2,4,9,10]))

####################################

def length_value(size,value):
    newlist=[]
    for x in range(0,size,1):
        newlist.append(value)
    return newlist
print(length_value(18,5))