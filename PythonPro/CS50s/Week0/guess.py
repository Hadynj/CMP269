# variables

guess = 10
print(guess)

# functions
def get_guess():
    guess = input("Enter a guess: ")    # prompt user for input
    return guess

print(get_guess())


# define function main that calls get_guess to be stored in guess 
def main():
    guess = get_guess()
    print(guess)

main()   # call main

# main1 checks if guess value from user equals 50
def main1():
    guess = get_guess()
    if guess == 50:
        print("Correct!")
    else:
        print("Incorrect!")
    
main1()     # call main1