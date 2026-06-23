emoticon = "v.v"   # define emoticon

def main():    # define function main
    global emoticon    # define emoticon as a global variable
    say("Is anyone there?")    # call say
    emoticon = ":D"      # emoticon  is a local variable 
    say ("Oh, hi!")

main()    # call main

def say(phrase):     # define say that takes in one arugment 
    print(phrase + " " + emoticon)    # display expression


