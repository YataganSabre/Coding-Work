# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 7b-2
# Date: 27/2/19
print("In this program, you will enter x number of usernames, and x number of passwords, and then try to guess them.")
usepass = {}  # Sets up initial dictionary
upto = int(input("How many do you want to enter?"))  # Asks how many sets they want to make
for z in range(0, upto):
    x = input("What is the username?")  # Inputs separate username and password here
    y = input("What is the password?")
    usepass[x] = y
for i in usepass:
    c = False
    while c == False:
        print("What is the password for username", i)  # Makes it clear what username is what
        user = input("Enter Here:")  # Where user enters password
        c = (user == usepass[i])  # Compares password to real one
        if c == False:
            print("ERROR, INTRUDER, TRY AGAIN")  # Displays when password is incorrect
            print()
        elif c == True:
            print("ACCESS GRANTED")  # Displays when password is correct
            print()
print("ALL BOUNDARIES COMPLETED, WELCOME OVERSEER.")  # Just a joke, but shows that the program has finished
