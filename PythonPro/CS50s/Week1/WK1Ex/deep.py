''' Goal: implements a program that prompts the user 
for the answer to the Great Question of Life, the Universe 
and Everything, outputting Yes if the user inputs 
42 or (case-insensitively)forty-two or forty two. 
Otherwise output No '''

# prompt user for input
question = input("What is the Answer to the Great Questioln of Life? ").casefold().strip()

# check for answer 
if question == ("42" or "forty-two" or "fourty two"):
    print("Yes")
else:
    print("No")