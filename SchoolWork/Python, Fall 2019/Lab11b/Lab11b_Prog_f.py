# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_c
# Date: 8/4/19
times = [0, 1, 2, 3, 4, 5, 6]  # Time in seconds
position = [0, 20, 30.5, 120, 70, 90.453, 150]  # Position (or distance)in....whatever you want I guess
print("This program will find the velocity between the values of the list times and positions.")

def velocity(t, p):
    vellist = []
    for x in range(0, len(t)):
        if x != len(t)-1:
            vel = (p[x+1]-p[x])/(t[x+1]-t[x])
            vellist.append(vel)
    print()
    print("This is the list of velocity:", vellist)

velocity(times, position)
