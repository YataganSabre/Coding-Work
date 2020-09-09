# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: None Currently
# Assignment: Lab 3b-2
# Date: 29/1/2019
from math import*
print("This program will determine the angle between two vectors, given your input")
print("----------------------------------------------------------------------------")

ax = int(input("What is your current position at X?"))  # These 3 assign the x,y,z for the users Pos
ay = int(input("What is your current position at Y?"))
az = int(input("What is your current position at Z?"))

bx = int(input("What is the given position of 'a' at X(First point)?"))  # Assigns the x,y,z for b,
by = int(input("What is the given position of 'a' at Y(First point)?"))  # the ones below do it for c
bz = int(input("What is the given position of 'a' at Z(First point)?"))

cx = int(input("What is the given position of 'b' at X(Second point)?"))
cy = int(input("What is the given position of 'b' at Y(Second point)?"))
cz = int(input("What is the given position of 'b' at Z(Second point)?"))

absq = sqrt(((bx-ax)**2)+((by-ay)**2)+((bz-az)**2))  # Both of these find vectors in a 3d space
acsq = sqrt(((cx-ax)**2)+((cy-ay)**2)+((cz-az)**2))

bc = (bx*cx)+(by*cy)+(bz*cz)  # finds dot product

aa = bc/(absq*acsq)  # finds what we will put into the arccos
angle = acos(aa)  #  inserts aa into crcsin
deg = angle*57.2957795

print("The angle is: ", deg)