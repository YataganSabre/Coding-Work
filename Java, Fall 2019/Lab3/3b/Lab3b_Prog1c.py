# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: None Currently
# Assignment: Lab 3b-1c
# Date: 28/1/2019
print("This program will find production of a well after a given number of days,")
print("for a given initial production rate, decline rate, and hyperbolic constant")
print()
xdays = float(input("How many days has it been since production started."))
production = float(input("What was the initial production rate."))
decline = float(input("What was the decline rate per day."))
hc = float(input("What is the hyperbolic constant?"))
final =(production)/(1+((hc*decline*xdays)**1/hc))
print()
print("The production of the well is: ", final)
