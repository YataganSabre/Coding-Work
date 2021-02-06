# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 6b-A
# Date: 13/2/19
print("This program will use the Collatz conjecture to get to 1, given a number.")
n = int(input("Enter a positive number over O without decimals."))
counter = 0
if n > 0:
    pn = n
    while pn != 1:
        if pn % 2 == 0:  # Uses the remainder of a number divided by 2 to find the even or odd portion of it
            pn = pn/2
            counter += 1
            print(pn)
        elif pn % 2 == 1:
            pn = (pn*3)+1
            counter += 1
            print(pn)
    print("Your sequence of numbers is shown above.")
    print("Your original number was", n, ", it took", counter, "iterations in order to complete the sequence.")
elif (n == 0) or (n < 0):
    print("Your number is not valid")

