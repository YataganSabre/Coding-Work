# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab9b_Act3
# Date: 27/3/19
import numpy as np
print("As a team, we have gone through all required sections of the tutorial,")
print("and each team member understands the material.")  # Opening statement
# Initializes arrays with hardcoded values
A = np.array([[2, 7, 8, 4], [7, 2, 7, 9], [67, 22, 4, 9]])  # 3,4
B = np.array([[4, 8], [6, 9], [4, 20], [4, 7]]) # 4,2
C = np.array([[90, 12, 54], [7, 4, 7]])  # 2,3
D = np.array([32, 66, 454])  # 3,1
G = A@B
E = G@C
print(E)
print(np.linalg.det(E))
if np.linalg.det(E) == 0.0:
    print("X would not be solvable")
elif np.linalg.solve(E, D) != 0:
    x = np.linalg.solve(E, D)
    print("The value of X is:\n", x)
