# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_a_part2
# Date: 8/4/19
import numpy as np
import matplotlib.pyplot as plt
import math
print("This program will find the volume left over of a cube if a hole is drilled through it.")
print("Enter the Length, Width, Height, and Radius with a comma separating them (a,b,c,d)")
pi = 3.141592654
#  Wait was the values of the box and drill supposed to be hard coded? Oh whatever user input version is better.


def boxvol(l, w, h, r):  # length, width, height, radius
    if min(l/2, w/2) < r:
        theta = math.acos((l/2)/r)
        sec1 = theta*(1/2*(r**2))
        tribase1 = math.sqrt((r**2)-(l/2))
        triarea1 = ((tribase1*2)*(l/2))
        corrarea1 = -(sec1 - triarea1)
        theta2 = math.asin((w/2)/r)
        sec2 = theta2*(1/2*(r**2))
        tribase2 = math.sqrt((r**2)-(w/2))
        triarea2 = (tribase2*2)*(w/2)
        corrarea2 = -(sec2 - triarea2)
        initv = l * w * h
        cylv = pi * (r ** 2) * h
        vol = (initv - cylv) + corrarea2 + corrarea1
        print("The volume of the box is: %f" % vol)
    else:
        initv = l * w * h
        cylv = pi * (r ** 2) * h
        vol = initv - cylv
        print("The volume of the box is: %f" % vol)


length = float(input("What is the Length? (a)"))  # Prompts the user for the all the needed info
width = float(input("What is the Width? (b)"))
height = float(input("What is the Height? (c)"))
radius = float(input("What is the Radius of the hole? (d)"))
boxvol(length, width, height, radius)