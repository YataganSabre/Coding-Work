# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 5-3
# Date: 20/2/19
tol = 10**-6
print("This program will find you summation result of the provided code.")  # Sets tol, informs user, asks for input.
x = float(input("Enter a x value within -1 and 1, not including those values."))
n = 1
total = 1.0
output = 1.0
exact = 1 / (1 - x)
counter = 0
if -1 < x < 1:  # Insures user input fits into allowed ranged
    while abs(output) >= tol:  # Checks if the output is allowed within the tolerance
        output = x**n
        n += 1  # Increases N, which is exponent put to x.
        if abs(output) > tol:  # Insures that the value is allowed before adding it to the total
            total += output
            counter += 1
        else:  # If the value can't be added, then the program must be coming to a close. Informs user.
            print("")
            print("The program is ending!")
else:
    print("Your x value is not within range, try again.")
print("The total was", total, "based on the program's summation result,", counter, "terms were added.")
print("This is compared to the exact value of", exact)
