# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab11b_Prog_c
# Date: 8/4/19
print("Enter your name, city, state, zip code, and address to receive a mailing label.")
name = input("What is your name?")
city = input("What is your city?")
state = input("What state does %s reside in?" % city)
zip_code = input("What is your zip code?")
address = input("What is your address?")


def label(n, c, s, z, a):
    print()
    print(n)
    print(a)
    print("%s, %s %s" % (c, s, z))


label(name, city, state, zip_code, address)