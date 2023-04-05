def readfile(fname):
    '''Read in data from the file, fname, and return a list with data stored'''
    # Open File
    infile = open(fname, 'r')

    # Read lines from File
    datalist = []

    for line in infile:
        # get data from line
        date, h, l, r = (line.split(','))
        lowtemp = int(l)
        hightemp = int(h)
        rainfall = float(r)
        m, d, y = date.split('/')
        month = int(m)
        day = int(d)
        year = int(y)
        # Put data into list
        datalist.append([day, month, year, lowtemp, hightemp, rainfall])

    # Close File and return
    infile.close()
    return datalist

def analyze(datalist, month, day):
    '''Find how many days in datalist match day and month, and return max temp,
    min temp, average low and high temp, and average precipitation.'''
    # Find historical data for date
    gooddata = []
    for singleday in datalist:
        if (singleday[0] == day) and (singleday[1] == month):
            gooddata.append([singleday[2], singleday[3], singleday[4], singleday[5]])

    # Perform analysis
    minsofar = 120
    maxsofar = -100
    numgooddates = 0
    sumofmin=0
    sumofmax=0
    raindays = 0
    for singleday in gooddata:
        numgooddates += 1
        sumofmin += singleday[1]
        sumofmax += singleday[2]
        if singleday[1] < minsofar:
            minsofar = singleday[1]
        if singleday[2] > maxsofar:
            maxsofar = singleday[2]
        if singleday[3] > 0:
            raindays += 1
    avglow = sumofmin / numgooddates
    avghigh = sumofmax / numgooddates
    rainpercent = raindays / numgooddates * 100

    #Return data
    return (numgooddates, minsofar, maxsofar, avglow, avghigh, rainpercent)

########## Read In Data ##########
filename = input("Enter the name of the data file: ")
alldata = readfile(filename)

########## Analyze Data ##########
# Get date of interest
month = int(input("For the date you care about, enter the month: "))
day = int(input("For the date you care about, enter the day: "))
(numdates, mintemp, maxtemp, avglow, avghigh, rainpercent) = analyze(alldata, month, day)

########## Present Results ##########
print("There were", numdates ,"days")
print("The lowest temperature on record was", mintemp)
print("The highest temperature on record was", maxtemp)
print("The average low has been", avglow)
print("The average high has been", avghigh)
print("The chance of rain is", rainpercent, "%")
