# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 7b-1
# Date: 27/2/19
print("This program will convert words to 'Pig Latin' until you enter the word 'stop'")
print()
ui = str(input("What is your word? Enter 'stop' to end."))
while ui != "stop":
    ui2 = ui.lower()
    if ui2[0] != "a" and ui2[0] != "e" and ui2[0] != "i" and ui2[0] != "o" and ui2[0] != "u" and ui2[0] != "y":
        y = ui2.replace(ui2[0], "")
        y += ui2[0] + "ay"
        print("Pig latin version would be", y)
    elif ui2[0] == "a" or ui2[0] == "e" or ui2[0] == "i" or ui2[0] == "o" or ui2[0] == "u" or ui2[0] == "y":
        y = ui2 + "yay"
        print("Pig later version would be", y)
    ui = str(input("What is your word? Enter 'stop' to end."))
print("Program has been ended by a user input.")