# By submitting this assignment, I agree to the following:
# Aggies do not lie, cheat, or steal, or tolerate those who do
# I have not given or received any unauthorized aid on this assignment
#
# Name: Kaan Montplaisir
# Section: 402
# Team: 21
# Assignment: Lab7dict_Prog1
# Date: 15/4/19

# 17.1
car_makers = {'Acura': 'Japan', 'Fiat': 'Egypt'}
car_makers['Tesla'] = 'USA'
car_makers['Fiat'] = 'Italy'
print('Acura made in', car_makers['Acura'])
print('Fiat made in', car_makers['Fiat'])
print('Tesla made in', car_makers['Tesla'])
# 18.1
country_capital = {'Spain': 'Madrid', 'Togo': 'Lome', 'Prussia': 'Konigsberg'}
del country_capital['Prussia']
print('Prussia deleted?', end=' ')
if 'Prussia' in country_capital:
    print('No.')
else:
    print('Yes.')