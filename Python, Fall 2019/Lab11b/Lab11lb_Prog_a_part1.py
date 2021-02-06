# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_a_part1
# Date: 8/4/19
import numpy as np
import matplotlib.pyplot as plt
print("This program will find the volume left over of a cube if a hole is drilled through it.")
print("Enter the Length, Width, Height, and Radius with a comma separating them (a,b,c,d)")
pi = 3.141592654
#  Wait was the values of the box and drill supposed to be hard coded? Oh whatever user input version is better.


def boxvol(a, b, c, d):  # length, width, height, radius
    initv = a*b*c
    cylv = pi*(d**2)*c
    vol = initv - cylv
    print("The volume of the box is: %f" % vol)


length = float(input("What is the Length? (a)"))  # Prompts the user for the all the needed info
width = float(input("What is the Width? (b)"))
height = float(input("What is the Height? (c)"))
radius = float(input("What is the Radius of the hole? (d)"))
boxvol(length, width, height, radius)
