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
v = np.array([1, 0])
M = np.array([[1.00583, -0.087156], [0.087156, 1.00583]])
vp = M@v
X = np.array([])  # Sets up info
Y = np.array([])
for x in range(200):
    vp = vp@M  # Interacts over and over to get the points of the graph
    X = np.append(X, vp[0])
    Y = np.append(Y, vp[1])
plt.plot([X], [Y], 's')  # Sets up plotting points
plt.xlabel("This is a x label")
plt.ylabel("This is a y label")
plt.title("This is a title")
plt.axis([-5, 5, -5, 5])
plt.show()
print("This creates a spiral like plot")
