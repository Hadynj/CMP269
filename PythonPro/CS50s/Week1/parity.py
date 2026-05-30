#different ways to illustrate ideas w/ the same results 

# illustration 1
def main():
    x = int(input("What's x?"))    # prompt user for input
    if is_even(x):
        print("Even")
    else:
        print("Odd")

main() 

# illustration 2
def is_even(n):
    n = int(input("What's n?"))    # prompt user for input
    if is_even(n):
        print("Even")
    else:
        print("Odd")

is_even()

# illustration 3
def is_even1(n1):
    n1 = int(input("What's n1?"))    # prompt user for input
    if n1 % 2 == 0:
        return True
    else:
        return False
is_even1()


# illustration 4
def is_even2(n2):
    n2 = int(input("What's n2?"))    # prompt user for input
    return True if n2 % 2 == 0 else False
is_even2()


# illustration 5
def is_even3(n3):
    n3  = int(input("What's n3?"))    # prompt user for input
    return n3 % 2 == 0

is_even3()
