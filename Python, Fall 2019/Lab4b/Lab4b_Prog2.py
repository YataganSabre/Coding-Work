# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 4b-2
# Date: 6/2/19
print("This program will find you the Re value and what its flow is.")
v = float(input("What is the velocity of the flow? (In meters)"))
d = float(input("What is the pipers diameter? (In meters)"))
visc = float(input("What is the liquids kinematic viscosity?(In M**2)"))
vd = v*d
re = vd/visc
if re < 2300:
    print("The flow is laminar with a value of:", re)
elif re > 2900:
    print("The flow is fully turbulent with a value of:", re)
elif re <= 2900 and re >=2300:
    print("The flow is in transition with a value of:", re)