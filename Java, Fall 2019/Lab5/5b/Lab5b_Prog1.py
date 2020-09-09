# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 5b-1
# Date: 21/2/19
print("This program will find you the stress on a plastic object given the strain value within range.")  # Informs
x = float(input("What a your strain value, that is from 0 to .263?"))  # Asks for input and explains what it needs.
loco = ""  # Sets loco to nothing since it was causing a yellow error and annoying me.
if 0 <= x <= .263:  # tests to see if X is even valid
    if 0 <= x <= .012:  # Area 1 equation
        y = 3650*x  # First equation is Y=3650(x), other areas are similar
        loco = "Area 1."  # Marks loco, which shows what location (or equation) is used.
    elif .012 < x <= .057:
        y = (3.50877193*x) + 43.8
        loco = "Area 2."
    elif .057 < x <= .180:
        y = (88.88888889*x) + 44
        loco = "Area 3."
    elif .180 <= x <= .263:
        y = (-34.22053232*x) + 60
        loco = "Area 4."
    y = round(y, 5)  # Rounds to a more pretty number (5th decimal place)
    print("With a strain value of", x, "your stress value will be", y, "at", loco)  # Prints output
else:
    print("Sorry, your value is not in range, make sure it is from 0 to .263 and try again.")  # Prints for a invalid x
