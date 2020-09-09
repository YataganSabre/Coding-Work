# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_e
# Date: 8/4/19
print("This program will take in a list of ints from the user and spit out the min, mean and max.")
mylist = []  # I don't think this program asked for a list but I assume this is still fine?
go = True
while go is True:  # Takes in values until told not to
    ui = input("Enter a number for the list, enter 'stop' when you are done")
    if ui != "stop":
        ui = float(ui)
        mylist.append(ui)
    elif ui == "stop":
        break


def organize(thelist):  # Finds all the information needed
    sorted(thelist)
    minnum = min(thelist)
    maxnum = max(thelist)
    mean = sum(thelist)/len(thelist)  # %g is like %f but it removes superfluous zeros, so 3.5000 turns into 3.5
    print("The min is %g, the max is %g, and the mean is %g" % (minnum, maxnum, mean))


organize(mylist)
