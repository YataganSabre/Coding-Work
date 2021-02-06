# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 4-2
# Date: 6/2/19
a = input("Is Blue your Favorite Color? T or F?")  # All of these gather use input, I have them input T or F rather then
if a == "T":                                       # True or false so I can easily tell if it's outputting a bool or
    a = True                                       # A string. Since True and "True" look the same as outputs.
if a == "F":
    a = False

b = input("Do you have 10 fingers? T or F?")
if b == "T":
    b = True
if b == "F":
    b = False

c = input("Do you like cake more then ice cream? T or F?")
if c == "T":
    c = True
if c == "F":
    c = False

print("Prob 1 is:", a and b and c)
print("Prob 2 is:", a or b or c)
print("Prob 3 is:", (not (a and not b)or (not c and b)) and (not b) or (not a and b and not c) or (a and not b))
print("Prob 4 is:", (not((b or not c)and(not a or not c)))or (not(c or not (b and c)))or (a and not c)and(not a or (a and b and c) or (a and ((b and not c)or (not b)))))
if a == True:
    an = 1
elif a == False:
    an = 0
if b == True:
    bn = 1
elif b == False:
    bn = 0
print("Prob 5 is:", bool(an) != bool(bn))  # I was googling stuff and found out how to do exclusive or, which works on 6
if c ==True:
    cn = 1
elif c == False:
    cn = 0
print("Prob 6 is:", bool(an) != bool(bn) != bool(cn))

