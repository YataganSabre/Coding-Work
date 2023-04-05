# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab7dict_Prog2
# Date: 15/4/19
student_grades = {
    'Andrew': [56, 79, 90, 22, 50],
    'Nisreen': [88, 62, 68, 75, 78],
    'Alan': [95, 88, 92, 85, 85],
    'Chang': [76, 88, 85, 82, 90],
    'Tricia': [99, 92, 95, 89, 99]
}
avglist = []  # A list of avgs
namelist = []  # A list of names
ass1 = []  # These lists will be for each seperate set of assignments
ass2 = []
ass3 = []
ass4 = []
ass5 = []
lettergrade = ''  # It was giving me a error for not having a letter point grade defined beforehand so here it is
new_student_grades = student_grades
for name in student_grades.keys():  # Goes through each name in the keys for various reasons
    ass1.append(student_grades[name][0])
    ass2.append(student_grades[name][1])
    ass3.append(student_grades[name][2])
    ass4.append(student_grades[name][3])
    ass5.append(student_grades[name][4])
    namelist.append(name)
    total = sum(student_grades[name])
    avglist.append(total/len(student_grades[name]))

maxgrade = max(avglist)
maxi = avglist.index(maxgrade)
if maxgrade >= 90:
    lettergrade = 'A'
elif 80 <= maxgrade < 90:
    lettergrade = 'B'
print("%s has the highest grade, with letter grade %s\n" % ((str(namelist[maxi])), lettergrade))
print("The average for Assignment 1: %g" % (sum(ass1)/len(ass1)))  # This is the big mess that displays the averages
print("The average for Assignment 2: %g" % (sum(ass2)/len(ass2)))
print("The average for Assignment 3: %g" % (sum(ass3)/len(ass3)))
print("The average for Assignment 4: %g" % (sum(ass4)/len(ass4)))
print("The average for Assignment 5: %g\n" % (sum(ass5)/len(ass5)))
highest_grades = student_grades[namelist[maxi]]

grades = []  # Finds the grades with the curve applied
for name, lst in student_grades.items():
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(lst[i] * (1 / highest_grades[i] * 100))
    new_student_grades[name] = new_lst
for name, lst in student_grades.items():
    print('{:8s}: '.format(name) + ', '.join(['{:8.2f}'.format(j) for j in lst]))