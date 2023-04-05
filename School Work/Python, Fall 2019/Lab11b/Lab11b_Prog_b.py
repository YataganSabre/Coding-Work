# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_b
# Date: 8/4/19
print("This will find the least profitable facility with a programmed list")
names = ["Acme and Co", "Bushwork's Pastries", "Bombs, Rope, and more", "Not-A-Illegal-Blackmarket-Factory", "Widget Co"]
ancost = [134000, 312323, 425454, 696969, 321635]
prodval = [324434, 1000000, 654564, 875432, 543565]


def profit(b, c):
    proflist = []
    for x in range(len(c)):
        p = c[x]-b[x]
        proflist.append(p)
    lp = min(proflist)
    lpi = proflist.index(lp)
    declare = "The least profitable facility is %s at a profitability of %i" % (names[lpi], proflist[lpi])
    print(declare)


profit(ancost, prodval)
