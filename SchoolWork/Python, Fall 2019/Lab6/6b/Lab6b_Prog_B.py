# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 6b-B
# Date: 13/2/19
print("This program will find you min, middle, and max of a list of numbers")
low = 0
high = 0
med = 0  # This area explains the program and sets each number to zero ahead of time.
counter = 0
ui = 0
average = 0
print("")
while ui >= 0:
    ui = int(input("What is your number? You will be asked again after this."))
    if ui >= 0:  # This part will only run if the entered number is valid
        if counter > 0:  # If it has already done the initial loop, it will begin assigning high and lows
            if ui > high:
                high = ui
                counter += 1
                med += ui
            elif ui < low:
                low = ui
                counter += 1
                med += ui
            elif ui == low and ui == high:  # This is to avoid errors if someone enters the same numbers over and over.
                counter += 1
                med += ui
        elif counter == 0:  # Only happens once, all variables used in the final to ui, which will be compared later.
            low = ui
            high = ui
            med += ui
            counter += 1

    else:
        print("")
        print("Your info is below")
average = med/counter
print("You put in", counter, "numbers:", low, "is your lowest number,", average, "is your average, and ", high, "is your largest number.")