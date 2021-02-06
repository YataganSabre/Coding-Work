# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Exam 1 Practice-10
# Date: 4/3/19
print("This program will take in your string inputs, until you enter stop, Stop, or STOP.")
print("It will then display the values in alphabetical order")  # Instructs user
list1 =[]  # Sets up the list
ui = str(input("What is your first value?"))
uil = ui.lower()  # Lower cases it for ease of use
while uil != "stop":
    list1.append(uil)
    ui = str(input("Your next value? When done enter stop, Stop, or STOP."))  # Reprompts user for hte next loop
    uil = ui.lower()
list2 = sorted(list1)  # Sorts the list
print("Your list sorted into alphabetical order is", list2)
