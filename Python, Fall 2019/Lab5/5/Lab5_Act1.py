# I know there's a better way of doing this, but the teacher at the time wouldn't let us so you have this nightmare.
# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 5-1
# Date: 25/2/19
print("This program will find the predicted chance of heart attack in 10 years given various info.")
print("Please answer questions within bounds and carefully.")
print()  # Prompts user, makes a blank lines, assigns values, the usual.
points = 0
gen = str(input("What is your gender? F or M?"))
age = int(input("What is your age from 20-79 in whole number format?"))  # Each section is cut into order
if age < 19 or age > 79:  # If the age isn't in the range, it is not going to bother running the program.
    print("This is a invalid age")
    exit()
#  Age Section
if gen != "M" and gen != "F":
    print("You have entered a incorrect value for gender! It must be M or F regardless of what you consider yourself.")
    exit()
elif gen == "M":
    if 20 <= age <= 34:
        points += -9
    elif 35 <= age <= 39:
        points += -4
    elif 40 <= age <= 44:
        points += 0  # Nothing actually happens here
    elif 45 <= age <= 49:
        points += 3
    elif 50 <= age <= 54:
        points += 6
    elif 55 <= age <= 59:
        points += 8
    elif 60 <= age <= 64:
        points += 10
    elif 65 <= age <= 69:
        points += 11
    elif 70 <= age <= 74:
        points += 12
    elif 75 <= age <= 79:
        points += 13
elif gen == "F":
    if 20 <= age <= 34:
        points += -7
    elif 35 <= age <= 39:
        points += -3
    elif 40 <= age <= 44:
        points += 0  # Nothing actually happens here
    elif 45 <= age <= 49:
        points += 3
    elif 50 <= age <= 54:
        points += 6
    elif 55 <= age <= 59:
        points += 8
    elif 60 <= age <= 64:
        points += 10
    elif 65 <= age <= 69:
        points += 12
    elif 70 <= age <= 74:
        points += 14
    elif 75 <= age <= 79:
        points += 16
# Cholesterol Section
chol = float(input("What is your total cholesterol?"))
if gen == "M":
    if 160 <= chol <= 199:
        if 20 <= age <= 39:
            points += 4
        elif 40 <= age <= 49:
            points += 3
        elif 50 <= age <= 59:
            points += 2
        elif 60 <= age <= 69:
            points += 1
        elif 70 <= age <= 79:
            points += 0
    elif 200 <= chol <= 239:
        if 20 <= age <= 39:
            points += 7
        elif 40 <= age <= 49:
            points += 5
        elif 50 <= age <= 59:
            points += 3
        elif 60 <= age <= 69:
            points += 1
        elif 70 <= age <= 79:
            points += 0
    elif 240 <= chol <= 279:
        if 20 <= age <= 39:
            points += 9
        elif 40 <= age <= 49:
            points += 6
        elif 50 <= age <= 59:
            points += 4
        elif 60 <= age <= 69:
            points += 2
        elif 70 <= age <= 79:
            points += 1
    elif chol >= 280:
        if 20 <= age <= 39:
            points += 11
        elif 40 <= age <= 49:
            points += 8
        elif 50 <= age <= 59:
            points += 5
        elif 60 <= age <= 69:
            points += 3
        elif 70 <= age <= 79:
            points += 1
elif gen == "F":
    if 160 <= chol <= 199:
        if 20 <= age <= 39:
            points += 4
        elif 40 <= age <= 49:
            points += 3
        elif 50 <= age <= 59:
            points += 2
        elif 60 <= age <= 69:
            points += 1
        elif 70 <= age <= 79:
            points += 0
    elif 200 <= chol <= 239:
        if 20 <= age <= 39:
            points += 8
        elif 40 <= age <= 49:
            points += 6
        elif 50 <= age <= 59:
            points += 4
        elif 60 <= age <= 69:
            points += 2
        elif 70 <= age <= 79:
            points += 1
    elif 240 <= chol <= 279:
        if 20 <= age <= 39:
            points += 11
        elif 40 <= age <= 49:
            points += 8
        elif 50 <= age <= 59:
            points += 5
        elif 60 <= age <= 69:
            points += 3
        elif 70 <= age <= 79:
            points += 2
    elif chol >= 280:
        if 20 <= age <= 39:
            points += 13
        elif 40 <= age <= 49:
            points += 10
        elif 50 <= age <= 59:
            points += 7
        elif 60 <= age <= 69:
            points += 4
        elif 70 <= age <= 79:
            points += 2
#  Smoking Section
smk = str(input("Do you smoke? Y or N?"))
if smk != "Y" and smk != "N":
    print("You have entered a incorrect value for the smoking section! Y or N is needed!")
    exit()
elif gen == "M":
    if smk == "N":
        points += 0  # Nothing happens here, since they don't smoke.
    elif smk == "Y":
        if 20 <= age <= 39:
            points += 8
        elif 40 <= age <= 49:
            points += 5
        elif 50 <= age <= 59:
            points += 3
        elif 60 <= age <= 69:
            points += 1
        elif 70 <= age <= 79:
            points += 1
elif gen == "F":
    if smk == "N":
        points += 0  # Nothing happens here, since they don't smoke.
    elif smk == "Y":
        if 20 <= age <= 39:
            points += 9
        elif 40 <= age <= 49:
            points += 7
        elif 50 <= age <= 59:
            points += 4
        elif 60 <= age <= 69:
            points += 2
        elif 70 <= age <= 79:
            points += 1
# HDL Section
hdl = float(input("What is your HDL value?"))
if hdl < 0:
    print("Your HDL is a number less then 0, which isn't possible, try again.")
    exit()
elif hdl >= 60:  # No F or M section since it is the same regardless of gender.
    points += -1
elif 50 <= hdl <= 59:
    points += 0  # Nothing happens here
elif 40 <= hdl <= 49:
    points += 1
elif hdl < 40:
    points += 2
# Systolic BP Section
sysf = float(input("What is the value of your Systolic Bp?"))
treat = str(input("Is it treated? Y or N?"))
if sysf < 0:  # These both check for bad values
    print("Retry, as that value of Systolic BP is not possible. Must be O or over.")
    exit()
elif treat != "Y" and treat != "N":
    print("Retry, you have entered the wrong value for treated or untreated, must be Y or N")
    exit()
print()
if gen == "M":
    if treat == "N":
        if 120 <= sysf <= 129:
            points += 0  # Nothing happens, just here for structure
        elif 130 <= sysf <= 139:
            points += 1
        elif 140 <= sysf <= 159:
            points += 1
        elif sysf >= 160:
            points += 2
    elif treat == "Y":
        if treat == "N":
            if 120 <= sysf <= 129:
                points += 1
            elif 130 <= sysf <= 139:
                points += 2
            elif 140 <= sysf <= 159:
                points += 2
            elif sysf >= 160:
                points += 3
elif gen == "F":
    if treat == "N":
        if 120 <= sysf <= 129:
            points += 1
        elif 130 <= sysf <= 139:
            points += 2
        elif 140 <= sysf <= 159:
            points += 3
        elif sysf >= 160:
            points += 4
    elif treat == "Y":
        if treat == "N":
            if 120 <= sysf <= 129:
                points += 3
            elif 130 <= sysf <= 139:
                points += 4
            elif 140 <= sysf <= 159:
                points += 5
            elif sysf >= 160:
                points += 6
#  Percentage
if gen == "M":
    if points < 0:
        print("Your heart attack risk in 10 years is less then 1%")
    elif 0 <= points <= 4:
        print("Your heart attack risk in 10 years is 1%")
    elif 5 <= points <= 6:
        print("Your heart attack risk in 10 years is 2%")
    elif points == 7:
        print("Your heart attack risk in 10 years is 3%")
    elif points == 8:
        print("Your heart attack risk in 10 years is 4%")
    elif points == 9:
        print("Your heart attack risk in 10 years is 5%")
    elif points == 10:
        print("Your heart attack risk in 10 years is 6%")
    elif points == 11:
        print("Your heart attack risk in 10 years is 8%")
    elif points == 12:
        print("Your heart attack risk in 10 years is 10%")
    elif points == 13:
        print("Your heart attack risk in 10 years is 12%")
    elif points == 14:
        print("Your heart attack risk in 10 years is 16%")
    elif points == 15:
        print("Your heart attack risk in 10 years is 20%")
    elif points == 16:
        print("Your heart attack risk in 10 years is 25%")
    elif points == 17:
        print("Your heart attack risk in 10 years is 3%")
    elif points > 17:
        print("Your heart attack risk in 10 years is greater then 30%")
elif gen == "F":
    if points < 9:
        print("Your heart attack risk in 10 years is less then 1%")
    elif 9 <= points <= 12:
        print("Your heart attack risk in 10 years is 1%")
    elif 13 <= points <= 14:
        print("Your heart attack risk in 10 years is 1%")
    elif points == 15:
        print("Your heart attack risk in 10 years is 3%")
    elif points == 16:
        print("Your heart attack risk in 10 years is 4%")
    elif points == 17:
        print("Your heart attack risk in 10 years is 5%")
    elif points == 18:
        print("Your heart attack risk in 10 years is 6%")
    elif points == 19:
        print("Your heart attack risk in 10 years is 8%")
    elif points == 20:
        print("Your heart attack risk in 10 years is 11%")
    elif points == 21:
        print("Your heart attack risk in 10 years is 14%")
    elif points == 22:
        print("Your heart attack risk in 10 years is 17%")
    elif points == 23:
        print("Your heart attack risk in 10 years is 22%")
    elif points == 24:
        print("Your heart attack risk in 10 years is 27%")
    elif points >= 25:
        print("Your heart attack risk in 10 years is greater then 30%")
