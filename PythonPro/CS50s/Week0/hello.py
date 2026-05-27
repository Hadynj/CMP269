print("hello, world")

#pseudocode (note to self)
# ask user their name 
name = input("What's your name? ")
print("hello, " + name)      # greet user and display user name

# remove whitespace an capitalize the first letter 
name = name.strip().title()


# fstring
print(f"hello, {name}")


# def: create a function 
def hello():
    print("hello")  

name = input("What's your name? ")   # ask user for name 
hello()     # call hello function 
print(name)   # display name 


# create a function w/ one arguement 
def hello(to):
    print("hello,", to)

name = input("What's your name? ")   # ask user for input
hello(name)     # call function


# def function main --> call functionn hello() & hello(to)
def main():
    name = input("What's your name? ")    # ask user for input
    hello(name)    # call user 

main()     # call main


