# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: None Currently
# Assignment: Lab 3b-1b
# Date: 28/1/2019
from math import*
print("This program will find you the sheer stress of a object")
print()  # we need normal stress, cohesion, and internal friction
ns = float(input("What is the normal stress on the object?"))
print()
coh = float(input("What is the cohesion on the object?"))
print()
ifric =float(input("What is the Angle of internal friction IN RADIANS?"))
tand = tan(ifric)
final = (ns*tand)+coh
print()
print("The sheer stress put on the object", final)