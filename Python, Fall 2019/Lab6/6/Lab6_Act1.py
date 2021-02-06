# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 6-1
# Date: 13/2/19
from math import*
print("This program will find the zero of a cubic polynomial, enter A, B, C, D, a, and b.")
A = int(input("What is the value of A?"))
B = int(input("What is the value of B?"))
C = int(input("What is the value of C?"))
D = int(input("What is the value of D?"))
a = int(input("What is the value of a?"))
b = int(input("What is the value of b?"))
c = (a+b)/2
fa = (A*(a**3))+(B*(a**2))+(C*a)+D
fc = (A*(c**3))+(B*(c**2))+(C*c)+D
counter = 0
tol = 10**-6
if abs((A*(a**3))+(B*(a**2))+(C*a)+D) <= tol:
    print("Root is at", a)
    exit()
if abs((A*(b**3))+(B*(b**2))+(C*b)+D) <= tol:
    print("Root is at", b)
    exit()
while abs(fa*fc) >= tol:
    fa = (A * (a ** 3)) + (B * (a ** 2)) + (C * a) + D
    fc = (A * (c ** 3)) + (B * (c ** 2)) + (C * c) + D
    if fa*fc > 0:
        a = c
        b = b
        counter += 1
        c = (a + b) / 2
    elif fa*fc < 0:
        b = c
        a = a
        counter += 1
        c = (a + b) / 2
print("A root occurs on:", round(c))
print("This took", counter, "iterations to find.")
