# change to emoji

text = input("Enter text: ")
def convert (text):
    emoji = text.replace(":)", "🙂").replace(":(", "🙁")
    print(emoji)
convert(text)
