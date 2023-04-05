# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 5b-2
# Date: 21/2/19  # Informs user what to input and what the program does
print("Program will tell you how many blocks on a pyramid calculated on iterations of two different types of equations.")
n = int(input("How many layers does this pyramid have, from 1 to N?"))
print()
n1 = n + 1  # Sets something up for a FOR Loop
one = "N of layers"  # These three are me being lazy with naming.
two = "LHS"
three = "RHS"
print("%-15s %-10s %-10s" % (one, two, three))
if n > 0:  # Tests to see if the n value is allowed.
    for x in range(1, n1):
        lhs = 0
        rhs = 0
        counter = 0
        z = 1
        for y in range(1, (x+1)):  # Checks to see if y is within 1 to x+1 (x+1 is just x to range)
            lhs += y**2  # Finds the n**2 for that part
            if rhs == 0:  # If RHS has no value, it will set it to z(1 by default)*x
                rhs += z*x
            elif rhs != 0:  # If RHS has already been set a value, it will:
                counter += 1  # Tick a counter
                z += 2  # Increase z by 2 (the 1,3,5,7 thing)
                rhs += z * (x - counter)  # Solve that section, and add the value to Rhs)
            print("%-15i %-10i %-10i" % (x, lhs, rhs))  # Displays that section of info
        print("--------------------------------------------------------------------")  # Makes things pretty
else:  # Prints a error if they didn't put in the right input
    print("You somehow managed to not put in a whole number greater then 0, try again.")
