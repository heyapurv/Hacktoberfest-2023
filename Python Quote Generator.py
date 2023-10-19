import random

# List of quotes
quotes = [
    "Life is what happens when you're busy making other plans. - John Lennon",
    "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
    "In three words I can sum up everything I've learned about life: it goes on. - Robert Frost",
    "The only way to do great work is to love what you do. - Steve Jobs",
    "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson"
]

def generate_random_quote():
    random_index = random.randint(0, len(quotes) - 1)
    return quotes[random_index]

if __name__ == "__main__":
    print("Welcome to the Random Quote Generator!")
    input("Press Enter to generate a random quote...")

    quote = generate_random_quote()
    print("\nHere's your random quote:\n")
    print(quote)
