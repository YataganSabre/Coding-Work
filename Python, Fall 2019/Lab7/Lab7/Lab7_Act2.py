# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 7-2
# Date: 18/3/19
print("This program will give you the 'cut' of the golfer's given their first two round scores and names.")
print()
namein = ""  # Sets up some variables to be used in a future loop
s1 = 0
s2 = 0
together = {}
passlist = []
faillist = []
while s1 > -1:  # Checks if a negative int is entered, if not then the loop keeps going
    namein = str(input("What is the players name?"))  # Asks for name
    s1 = int(input("What was their first score? INSERT A NEGATIVE TO FINISH"))
    if s1 <= -1:  # Breaks the entire thing, avoiding setting up new names if they cancel inputting
        break
    s2 = int(input("What is their second score?"))
    s = s1+s2
    together[namein] = s  # Sets up a name and their score in a dictionary
scores = list(together.values())
scores.sort()
if len(scores) % 2 == 0:  # These len(scores) part is just to check if i have to divide later to find the median
    while len(scores) > 2:
        del scores[-1]  # Cuts off the front and back end of a list until they have 2 pieces left
        del scores[0]
        med = (scores[0] + scores[1])/2  # Finds the average of the last 2 remaining parts
elif len(scores) % 2 != 0:
    while len(scores) > 1:
        del scores[-1]  # Cuts off the front and back end of the list until they have one piece left
        del scores[0]
        med = scores[0]
keySet = together.keys()  # Makes a list of keys from the dictionary
for key in keySet:  # For a key in the key set
    if together.get(key) > med:  # See if its value is greater then the med
        faillist.append(key)  # If it is, it gets added to the fail list
    elif together.get(key) <= med:  # If it isn't...
        passlist.append(key)  # It gets added to the passlist
print("If a name is listed here, they have made the cut:", passlist)
print("If a name is listed here, they have not made the cut:", faillist)