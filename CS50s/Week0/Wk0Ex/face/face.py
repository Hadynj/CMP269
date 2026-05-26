# change to emoji

text = input("Enter text: ")
def convert (text):
    emoji = text.replace(":)", "🙂")
    emoji = text.replace("):", "🙁")

convert(text)
