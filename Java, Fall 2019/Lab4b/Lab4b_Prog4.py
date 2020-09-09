# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 4b-4
# Date: 6/2/19
import cmath  # I had to google this online, I assume this is allowed? If not feel free to tell me.
print("This program will find the roots of a quadratic given A, B, C.")
print("If your output has a 'Oj' on it, that means it is a non imaginary number.")

a = float(input("What is the value of A?"))
b = float(input("What is the value of B?"))
c = float(input("What is the value of C?"))
if a != 0:
    d = (b**2) - (4*a*c)
    sol1 = (-b-cmath.sqrt(d))/(2*a)  # I use these since I can't figure out how  to find imaginaries manually
    sol2 = (-b+cmath.sqrt(d))/(2*a)
    print("The roots are", sol1, "and", sol2)
elif a == 0:  # If the equation is only up to the 1st degree, we can just do -c/b
    sol1 = -(c/b)
    print("The only root is", sol1)
else:
    print("Error has been made.")