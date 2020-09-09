# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 7b-2
# Date: 27/2/19
from math import*
print("This program will find you the magnitude of A and B, A+B, A-B, and the dot product.")
va = []  # Sets up lists
vb = []
proceed = ""
while proceed != "stop":  # Will go on if stop is entered for the last input
    va.append(float(input("Add a value to Vector A.")))
    vb.append(float(input("Add a value to Vector B.")))
    proceed = str(input("Enter 'stop' to continue to the calculations, enter anything else to resume adding numbers."))
mai = 0
for x in range(0, len(va)):  # Finds magnitude of A
    mai += va[x]**2
ma = sqrt(mai)
mbi = 0
for y in range(0, len(vb)):
    mbi += vb[y]**2
mb = sqrt(mbi)
print("Magnitude of  A and B respectively are", ma, "and", mb)
print("A+B is:", ma+mb)
print("A-B is:", ma-mb)
#  Dot product section
dot = 0
for z in range(0,len(va)):
    dot += va[z] * vb[z]
print("The dot product is:", dot)
