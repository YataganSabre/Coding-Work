# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab10b_Act3
# Date: 7/4/19
import matplotlib.pyplot as plt
import numpy as np
import csv
print("This program will contain code to display various graphs,")
print("that will be displayed on a PDF.")
print()  # Tells user some basic info
with open('data.csv', 'r') as weather:
    table = csv.reader(weather)
    counter = 0
    lineX = np.array([])
    lineY = np.array([])
    scatX = np.array([])
    scatY = np.array([])
    days = np.array([])
    hightemp = []
    lowtemp = []
    averagetemp = []
    precep = np.array([])
    for row in table:
        if counter > 0:
            lineX = np.append(lineX, int(row[2]))
            lineY = np.append(lineY, float(row[11]))
            scatX = np.append(scatX, int(row[2]))
            scatY = np.append(scatY, float(row[5]))
            precep = np.append(precep, float(row[13]))
            hightemp.append(float(row[1]))
            lowtemp.append(float(row[3]))
            averagetemp.append(float(row[2]))

        counter += 1
        days = np.append(days, counter)

figure = plt.figure()
leftaxis = figure.add_subplot(1, 1, 1)
rightaxis = leftaxis.twinx()
leftaxis.plot([days], [lineX], 'r.')  # I can not for the life of me figure out why it is not displaying lines
rightaxis.plot([days], [lineY], 'b.')  # So you're just getting this
leftaxis.set_xlabel("Times in days")
leftaxis.set_ylabel("Temperature Average (In Red)")
rightaxis.set_ylabel("Pressure Average (In Blue)")
plt.title("Pressure and Temp average in regards to time")
plt.show()

plt.figure()  # Histogram
plt.hist(precep, width=.5, bins=10)
plt.axis([0, 10, 0, 500])
plt.title("Days where precipitation was X")
plt.xlabel("Precipitation (In Inches)")
plt.ylabel('Number of days')
plt.show()

plt.figure()  # Scatter
plt.title("Temp and Dew point Avg in relation to each other.")
plt.plot([scatX], [scatY], 'bo')
plt.xlabel("Temp Avg")
plt.ylabel("Dew Point Avg")
plt.show()

plt.figure()  # Bar
plt.title("High, Low, Average temps per month")
plt.ylabel("Temperature")
plt.xlabel("Months")



