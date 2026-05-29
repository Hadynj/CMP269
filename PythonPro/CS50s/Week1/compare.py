x = int(input("What's x? "))      # ask user for input x 
y = int(input("What's y? "))      # ask user for input y

'''
start 
x < y --> true
x is less than y 

x < y --> false 
x is greater than y
'''

# check conditional if x < y, x > y, else x == y
if x < y:          
    print("x is less than y")
elif x > y:
    print("x is greater than y")
else: 
    print("x is equal to y")

'''conditional where there is only one equation

x == y or not
if x == y:
    print("x is equal to y")
else:
    print("x is not equal to y")


x is not equal to y or equal
if x != y: 
    print("x is not equal to y")
else: 
    print("x is equal to y")
'''