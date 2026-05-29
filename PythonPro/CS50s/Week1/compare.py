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
