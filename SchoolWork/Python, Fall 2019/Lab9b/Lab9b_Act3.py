# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab9b_Act3
# Date: 27/3/19
import csv
print("This program will find you Max and Min temp, average daily precipitation, % of days where humidity is over 90")
print("and how many days it rained")
print() # Tells user some basic info
with open('example.csv', 'r') as weather:  # Takes in file
    table = csv.reader(weather)  # Reads in
    tmaxlist = []
    tminlist = []
    prelist = []
    humidlist = []
    dayrained = 0
    over90 = 0
    counter = 0
    for row in table:
        print(row)
        if counter > 0:  # I'm using the counter system so I don't intake non number items
            tmaxlist.append(int(row[1]))  # All of these just add their respective ints or floats to a list
            tminlist.append(int(row[3]))
            prelist.append(float(row[13]))
            if float(row[13]) > 0:  # Checks if slot 13 is over 0, which means it has rained that day
                dayrained += 1
            if float(row[7]) > 90:  # Checks if the humidity was over 90 for a given day
                over90 += 1
        counter += 1
    print("The max temperature across the 3 year period is:", max(tmaxlist))
    print("The min temperature across the 3 year period is:", min(tminlist))
    lenpre = len(prelist)  # These last few lines are purely for small math or posting information.
    avpre = sum(prelist)/lenpre
    over90per = over90/(counter-1)
    print("The average precipitation across the 3 year period is:", avpre)
    print("The percentage of days that the humidity was over is:", round(over90per*100, 2), "percent.")
    print("The number of days that rained in the 3 year period is:", dayrained)