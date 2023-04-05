# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Exam 1 Practice-7
# Date: 4/3/19
print("This program will take in int n and show you n+nn+nnn.")
ui = int(input("What is your number?"))  # Stores initial int for self use
n = str(ui)  # Converts to string
nn = n+n  # Goes through and sets up nn and nnn as their string versions
nnn = n+n+n
total = int(n)+int(nn)+int(nnn)  # Converts each back to a int, then adds together
print("The value of n+nn+nnn is", total)

