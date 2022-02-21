#Created by Kaan M.
#This project, per instructions is intended to count the number of requests (lines) for the last 6 months, then the number of lines for the entire log.
import urllib.request
import os.path
#checks to see if the file exists, if it does NOT exist, download it and countine running.
if not(os.path.isfile('awslog.log')):  
    print('You do not have the file, beginning file download with urllib2...')
    url = 'https://s3.amazonaws.com/tcmg476/http_access_log'
    urllib.request.urlretrieve(url, 'awslog.log')
    print('File downloaded, resuming program.')
    
# Opening a file
file = open("awslog.log","r")
  
# Reading from file
Content = file.read() 
# Splitting list by new lines (each line is a different request)
CoList = Content.split("\n")

#Intialize different stuff i'll use in a bit
CounterM = 0
Counter = 0
monthcheck = False
for i in CoList:
    if monthcheck == True: 
        CounterM += 1
    Counter += 1 #counts total requests
    if '11/Apr/1995:00:00:16' in i: #checks start of 6 month period to end
           monthcheck = True
           CounterM += 1
#print outputs
print("This is the number of requests (lines) from the last 6 months: ", CounterM)         
print("This is the number of requests (lines) in the log: ", Counter)
