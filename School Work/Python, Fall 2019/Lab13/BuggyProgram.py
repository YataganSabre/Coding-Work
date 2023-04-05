########## Read in Data ##########
#Open File
filename = input("Enter the name of the data file: ")
infile = open(filename, 'r')

#Read lines from File
datalist = []

for line in infile:
    #get data from line
    date, h, l, r = (line.split(','))
    lowtemp = int(l)
    hightemp = int(h)
    rainfall = float(r)
    m, d, y = date.split('/')
    month = int(m)
    day = int(d)
    year = int(y)
    #Put data into list
    datalist.append([day, month, year, lowtemp, hightemp, rainfall])

#Close File
infile.close()

########## Analyze Data ##########
# Get date of interest
month = int(input("For the date you care about, enter the month: "))
day = int(input("For the date you care about, enter the day: "))

# Find historical data for date
gooddata = []
for singleday in datalist:
    if (singleday[0] == day) and (singleday[1] == month):
        gooddata.append([singleday[2], singleday[3], singleday[4], singleday[5]])

# Perform analysis
minsofar = 120
maxsofar = -100
sumofmin=0
sumofmax=0
raindays = 0
counter = 0
for singleday in gooddata:
    counter += 1
    sumofmin += singleday[1]
    sumofmax += singleday[2]
    if singleday[1] < minsofar:
        minsofar = singleday[1]
    if singleday[2] > maxsofar:
        maxsofar = singleday[2]
    if singleday[3] > 0:
        raindays += 1
avglow = sumofmin / counter
avghigh = sumofmax / counter
rainpercent = (raindays / counter) * 100


########## Present Results ##########
print("There were", counter,"days")
print("The lowest temperature on record was", minsofar)
print("The highest temperature on record was", maxsofar)
print("The average low has been", avglow)
print("The average high has been", avghigh)
print("The chance of rain is", rainpercent, "%")


exit(0)
