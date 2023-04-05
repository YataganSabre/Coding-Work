# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Exam 1 Practice-10
# Date: 4/3/19
print("This program will take a string input and reverse it")
rev = ""  # Sets up rev for later
ui = str(input("What is the phrase you want reversed?"))
end = -(len(ui))  # Finds the length of end and makes it negative
for x in range(-1, (end-1), -1):  # Goes from -1 (Last value of a string) to -N (First value of string)
    rev += ui[x]  # Finds the value of the last part of the string first, makes it the start of rev, repeats for 2nd
print("Your reversed string is:", rev)
