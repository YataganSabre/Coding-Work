# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_c
# Date: 8/4/19
import csv


def tsvconvert(c):  # Names a function as tsvconvert
    with open(c, 'r') as intialfile:  # Opens the csv to read, and a tsv to write to
        newname = c.replace(".csv", ".tsv")
        with open(newname, 'w') as afterfile:
            ifile = csv.reader(intialfile)
            for row in ifile:  # There's only one row but I don't know how else to do this
                for x in row:  # Goes through that one row and gets each seperate value, puts it back together with \t
                    afterfile.write("%s\t" % x)  # Writes that info to a tsv, with the new delimiter
                afterfile.write("\n")
    print("Conversion done, check your files")  # Provides feedback for the user


ui = input("Enter the name of the file.")
tsvconvert(ui)
