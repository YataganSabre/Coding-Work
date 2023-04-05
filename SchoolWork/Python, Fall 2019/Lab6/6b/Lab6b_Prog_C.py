# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 6b-C
# Date: 14/2/19
print("This program will find you the number of prime numbers between L and U, as long as they are between 2-100.")
L = int(input("What is the value of your lower limit (L)."))
U = int(input("What is the value of upper limit (U)."))
# Made both of the variables capital since a lower case L looks like a "one" (Compare 1 and l)
div = 1
N = "Number"
D = "Divisors"
ND = "Number of divisors"
counter = 0
P = "Prime"
print("Upper bound is", U)
print("Lower bound is", L)
print("%-10s %-60s %-20s" % (N, D, ND))
if (L >= 2) and (U <= 100):
    while L <= U:
        if div == 1:
            counter += 1  # Sets everything up and starts the list.
            divlist = [1]
            div += 1
        elif div > 1 and div != L:
            if L % div == 0:
                divlist.append(div)  # Only adds a number as a divisor if the remainder is 0
                div += 1
                counter += 1  # Ticks counter whenever it gets a new divisor
            elif L % div != 0:
                div += 1
        if div == L:
            div = 1
            counter += 1  # Resets div for next set, ticks counter one more time, and adds the number to its own divlist
            divlist.append(L)
            ' '.join(map(str, divlist))  # Converts divlist into a string, then joins all the values together
            if counter == 2:  # If it only has 2 divisors in its list (1 and itself) it must be prime.
                print("%-10i %-60s %-20s" % (L, divlist, P))  # I had to join them in order to use this format style
                counter = 0
                L += 1
            elif counter > 2:
                print("%-10i %-60s %-20i" % (L, divlist, counter))
                counter = 0
                L += 1
else:  # If they don't enter a set of numbers in and between 2-100 then it just fails
    print("You did not reach the right bounds.")
    z = range(1,6, 2)
    print(z)