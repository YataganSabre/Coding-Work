# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 4b-3
# Date: 6/2/19
print("This program will find the amount of widgets made after X days, between 0-100")
day = int(input("What day is it?"))
print()
if 0 <= day <= 10:
    print("You have made:", 10*day, "Widgets.")
elif 11 <= day <= 60:
    print("You have made:", 40*(day-10)+50, "Widgets")
elif 61 <= day <= 100:
    prev = 60
    x = day - 60
    set1 = x ** (39 / 40)
    set2 = set1 * 40
    set3 = set2+2050
    set4 = round(set3)
    print("You have made:", set4,"Widgets")
else:
    print("You have not entered a value within the allowed range.")