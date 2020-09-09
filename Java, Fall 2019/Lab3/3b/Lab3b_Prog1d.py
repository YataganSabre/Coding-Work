# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: None Currently
# Assignment: Lab 3b-1d
# Date: 28/1/2019
print("This program will find the average length of a M/M/1 queue.")
print()
a = float(input("What is the arrival rate?"))
s = float(input("What is the service rate?"))
p = a/s
final = (p**2)/(1-p)
print()
print("The average length is: ", final)
