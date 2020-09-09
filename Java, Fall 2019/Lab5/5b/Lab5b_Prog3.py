# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab 5b-3
# Date: 21/2/19
user_score = 0
simon_pattern = 'RRGBRYYBGY'
user_pattern = 'RRGBBRYBGY'
for x in range(0, len(simon_pattern)):  # Scans in the length of the pattern for a range
    if simon_pattern[x] == user_pattern[x]:  # Checks position and sees if they match for both
        user_score += 1
    elif simon_pattern[x] != user_pattern[x]:  # Breaks code the moment it fails
        break
print('User score:', user_score)  # Prints score
