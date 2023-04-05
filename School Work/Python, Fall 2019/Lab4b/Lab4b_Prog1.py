# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 4b-1
# Date: 6/2/19
print("This program will tell you the largest number given out of three.")
print()
n1 = float(input("What is your first number?"))  # Prompts user
n2 = float(input("What is your second number?"))
n3 = float(input("What is your third number?"))
print("--------------------------------------------------------------------------")
if n1 > n2 and n1 > n3:  # Compares n1 to others
    print("The largest number is n1 which is:", n1)
elif n2 > n1 and n2 > n3:  # Compares n2 to others
    print("The largest number is n2 which is:", n2)
elif n3 > n1 and n3 > n2:  # Compares n3 to others
    print("The largest number is n3 which is:", n3)
else:
    print("You may have entered a number that is equal to another given number.")