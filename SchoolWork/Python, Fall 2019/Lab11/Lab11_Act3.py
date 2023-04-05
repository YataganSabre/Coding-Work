# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11_Act3
# Date: 8/4/19
import numpy as np
import matplotlib.pyplot as plt
print("This program will display two separate graphs with different values for F.")
Yone = np.array([])  # Yone and two are for the first graph, Y three is for the second graph
Ytwo = np.array([])
X = np.linspace(-2, 2, 9)
Ythree = np.array([])
for x in X:  # Finds the seperate X,Y values for the plots
    ft = (1/4)*(x**2)  # Two equations set up
    fs = (1/24)*(x**2)
    Yone = np.append(Yone, ft)  # Adds Values to array for later use
    Ytwo = np.append(Ytwo, fs)

w1 = 2  # Line widths
w2 = 4
fig = plt.figure()
plt.plot(X, Yone, 'b', linewidth=w1)  # F = 2
p2 = fig.add_subplot(1, 1, 1)  # plots figures, applies color and width
p2.plot(X, Ytwo, 'r', linewidth=w2)  # F = 6
plt.title("Parabola Plots with Varying Focal Lengths")
plt.xlabel("X")
plt.ylabel("Y")
plt.axis([-2, 2, 0, .5])
plt.show()

X2 = np.linspace(-4, 4, 25)
A = 2  # Sets up values for X2 and the poly's equation
B = 3
C = -11
D = -6
for x in X2:
    PolY = (A*(x**3))+(B*(x**2))+(C*x) + D  # PolY is the Y of the polynomial when x is present
    Ythree = np.append(Ythree, PolY)
plt.plot(X2, Ythree, 'b.')
plt.xlabel("X")
plt.ylabel("Y")
plt.title("Plot of a Cubic Polynomial")
plt.axis([-4, 4, -50, 100])
plt.show()
