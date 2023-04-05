# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab9b_Act1
# Date: 27/3/19
celfile = open('Celsius.dat', 'r')  # Sets up each file to be either read or written on
farfile = open('Fahrenheit.dat', 'w')
celfile.readline()
for x in celfile:  # Grabs each x (line) in celsius
    y = str((float(x) * (9/5)) + 32)  # Does the formula of C to F
    farfile.write(y)  # Puts F on file
    farfile.write('\n')  # goes to next line
