# function: return value 

def greet(input):    # greet takes one arguement 
    if "hello" in input:     # checks if hello is in input
        #print("hello, there")
        return "hello, there"
    else:
        #print("I'm not sure what you mean")
        return "I'm not sure what you mean"    

greeting = greet("hello, computer")     # calls greet 

print("Hmmm, " + greeting)    # display expression/side effect 
print(greeting + "David ")

    