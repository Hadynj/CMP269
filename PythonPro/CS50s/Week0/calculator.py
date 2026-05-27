# integers 
x = int(input ("What's x? "))   # get input x
y = int(input ("What's y? "))   # get input y

z = x + y   # add
print(z)    # display result

print(float(z))  # floating number
print(round(z), 2)   # round number 2 dp
print(f"{z:,.2f}")  # fstring 2 dp


print(round(float(x) / float(y), 2))   # division, float, round

