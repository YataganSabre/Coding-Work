# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 4-0
# Date: 6/2/19
tol = 1e-10  # Sets the tolerance
ec = .1+.1+.1
base = .3
b1 = (base == ec)  # Compares .1+.1+.1 to .3
print("Is .1+.1+.1 == .3?")
print(b1)
tolfinal = (ec-base)<tol  # This finds out if the difference between the values of ec and are negligible
print("Is .1+.1+.1 == .3 when a tolerance is applied?")
print(tolfinal)
print()

ec = .33333333333
base = 1/3
b1 = (base == ec)  # Compares .33333333333 to 1/3
print("Is .33333333333 == 1/3?")
print(b1)  # States the previous comparision.
tolfinal = (ec-base) < tol  # Finds out if the difference between ec and base is negligible
print("Is .33333333333 == 1/3 when a tolerance is applied?")
print(tolfinal)





