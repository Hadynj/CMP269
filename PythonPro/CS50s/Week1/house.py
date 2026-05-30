# using match to replace elif

name = input("What's your name?")

# idea 1
if name == "Harry":
      print("Gryffindor")
elif name == "Hermione":
      print("Gryffindor")
elif name == "Ron": 
      print("Gryffindor")
elif name == "Draco":
      print("Slytherin")
else:
      print("Who?")


# idea 2
if name == "Harry" or name == "Hermione" or name == "Ron": 
      print("Gryffindor")
elif name == "Draco":
      print("Slytherin")
else:
      print("Who?")


# idea 3 
name = input("What's your name? ")

match name: 
    case "Harry":
          print("Gryffindor")
    case "Hermione":
          print("Gryffindor")
    case "Ron": 
          print("Gryffindor")
    case "Draco":
          print("Slytherin")
    case _:
          print("Who?")


# idea 4 
name = input("What's your name? ")
match name: 
    case "Harry" | "Hermione" | "Ron":
          print("Gryffindor")
    case "Draco":
          print("Slytherin")
    case _:
          print("Who?")