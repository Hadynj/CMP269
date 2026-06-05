question = input("Enter Great Question of Life? ").casefold().strip()

if question == "42" or int(42) or "forty-two" or "fourty two":
    print("Yes")
else:
    print("no")