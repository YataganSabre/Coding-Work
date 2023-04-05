# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab9b_Act2
# Date: 27/3/19
import csv
filename = str(input("Insert a name for the .csv, csv must be part of it (like 'example.csv')."))
with open(filename, 'w') as canvas:
    p = float(input("What is the value of the loan (P)?"))
    n = int(input("How many months will this be over (N)?"))
    i = float(input("What is the monthly payment rate (i)?"))
    j = i/12  # Sets up equation and such
    m = p*(j/(1-( (1+j)**-n ) ))
    ai = 0
    canvas.write("Month, Beginning Balance, Monthly Interest, Accrued Interest, Final Balance\n")
    canvas.write("%s %s %s %s %s\n" % ('0', ',', ',', ',', ','+str(p)))  # Writes out the very top 2 lines ahead of time
    for x in range(1, n+1):
        m = p * (j / (1 - ((1 + j) ** -n)))  # All of this just math
        mi = p*j
        ai += mi
        fp = p - (m-mi)
        canvas.write("%s %s %s %s %s\n" % (str(round(x,2)), ','+str(round(p,2)), ','+str(round(mi,2)), ','+str(round(ai,2)), ','+str(round(fp,2))))
        # Displays data into the file, also i rounded the floats to be actual dollars
        p = fp  # resets the new loan amount to the one found after removing the montly cost