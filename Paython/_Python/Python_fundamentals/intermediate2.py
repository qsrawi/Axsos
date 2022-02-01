# x = [ [5,2,3], [10,8,9] ] 
# students = [
#      {'first_name':  'Michael', 'last_name' : 'Jordan'},
#      {'first_name' : 'John', 'last_name' : 'Rosales'}
# ]
# sports_directory = {
#     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
#     'soccer' : ['Messi', 'Ronaldo', 'Rooney']
# }
# z = [ {'x': 10, 'y': 20} ]

# x[1][0]=15
# print(x)
# students = [
#     {'first_name':  'Michael', 'last_name' : 'Jordan'},
#     {'first_name' : 'John', 'last_name' : 'Rosales'}
# ]
# students[0]['last_name']="oday"
# print(students)

# sports_directory = {
#     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
#     'soccer' : ['Messi', 'Ronaldo', 'Rooney']
# }
# sports_directory['soccer'][0]="Andres"
# print(sports_directory)

# z = [ {'x': 10, 'y': 20} ]
# z[0]['y']=30
# print(z)

####################################################

students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]
# def iterateDictionary(some_list):
#     for x in range(0,len(some_list)):
#             print(f"{some_list[x]}")

# print(iterateDictionary(students))

####################################################

# def iterateDictionary2(key_name, some_list):
#     for x in range(0,len(some_list)):
#         print(some_list[x][key_name])


# print(iterateDictionary2('first_name', students))

####################################################

dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}


def printInfo(some_dict):
    for x in range(0,len(some_dict)):
        for j in range(0,len(some_dict[x])):
            print(some_dict[x][j])

printInfo(dojo)


