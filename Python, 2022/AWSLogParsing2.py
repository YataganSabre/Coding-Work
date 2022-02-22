#How many requests were made on each day? 
#How many requests were made on a week-by-week basis? Per month?
#What percentage of the requests were not successful (any 4xx status code)?
#What percentage of the requests were redirected elsewhere (any 3xx codes)?
#What was the most-requested file?
#What was the least-requested file?
# This will be the main file
import urllib.request
import os.path
import re
import datetime as d

# Checks to see if the file exists, if it does NOT exist, download it and countine running.
if not(os.path.isfile('awslog.txt')):  
    print('You do not have the file, beginning file download with urllib2...')
    url = 'https://s3.amazonaws.com/tcmg476/http_access_log'
    urllib.request.urlretrieve(url, 'awslog.txt')
    print('File downloaded, resuming program.')
    
# Opens and splits file
file = open("awslog.txt","r")

read_file = file.read()
biglist = read_file.split('\n')

file.close()
#i'm not testing to see if every file exists and then makign the ones that don't exist, if it doesn't see the first file it'll make all of them again
#only opens the aws file if we need to work on it
if not(os.path.isfile('oct.txt')):
  print("Creating seperate text files, please wait.")
  txt1=open('oct1994.txt', 'w')
  txt2=open('nov.txt', 'w')
  txt3=open('dec.txt', 'w')
  txt4=open('jan.txt', 'w')
  txt5=open('feb.txt', 'w')
  txt6=open('mar.txt', 'w')
  txt7=open('apr.txt', 'w')
  txt8=open('may.txt', 'w')
  txt9=open('jun.txt', 'w')
  txt10=open('jul.txt', 'w')
  txt11=open('aug.txt', 'w')
  txt12=open('sep.txt', 'w')
  txt13=open('oct1995.txt', 'w')
  #Making 13 files, I know you said 12 but two different octobers are taking place.
  for i in biglist:
    if 'Oct/1994' in i:
      txt1.write(i + "\n")
    if 'Nov/1994' in i:
      txt2.write(i + "\n")
    if 'Dec/1994' in i:
      txt3.write(i + "\n")
    if 'Jan/1995' in i:
      txt4.write(i + "\n")
    if 'Feb/1995' in i:
      txt5.write(i + "\n")
    if 'Mar/1995' in i:
      txt6.write(i + "\n")
    if 'Apr/1995' in i:
      txt7.write(i + "\n")
    if 'May/1995' in i:
      txt8.write(i + "\n")
    if 'Jun/1995' in i:
      txt9.write(i + "\n")
    if 'Jul/1995' in i:
      txt10.write(i + "\n")
    if 'Aug/1995' in i:
      txt11.write(i + "\n")
    if 'Sep/1995' in i:
      txt12.write(i + "\n")
    if 'Oct/1995' in i:
      txt13.write(i + "\n")
  print("Files created, resuming program.")
  #close original aws txt file and others, looks ugly but whoops
  txt1.close()
  txt2.close()
  txt3.close()
  txt4.close()
  txt5.close()
  txt6.close()
  txt7.close()
  txt8.close()
  txt9.close()
  txt10.close()
  txt11.close()
  txt12.close()
  txt13.close()
#we don't have to open read all of the txt files to do the rest of the assignment so...we won't! 
#just going to use the big list we made rather then make like 13 different loops
monday = 0
tuesday = 0
wednesday = 0
thursday = 0
friday = 0
saturday = 0
sunday = 0
count = 0
fourcode = 0
threecode = 0
regex = re.compile("(.*?) - - \[(.*?):(.*) .*\] \"[A-Z]{3,6} (.*?) HTTP.*\" (\d{3}) (.+)")  
for i in biglist:
  pieces = re.split(regex, i)
  if len(pieces) > 2: #some parts don't have proper requests, so they get this to sift through them
    count += 1
    date = d.datetime.strptime(pieces[2], '%d/%b/%Y')
    day = d.datetime.weekday(date) #this converts a day of the week to a value from 0-6, 0 being monday
    if day == 0:
      monday += 1
    if day == 1:
      tuesday += 1
    if day == 2:
      wednesday += 1
    if day == 3:
      thursday += 1
    if day == 4:
      friday += 1
    if day == 5:
      saturday += 1
    if day == 6:
      sunday += 1
    #section for code counting aka the 4xx and 3xx codes
    code = pieces[5]
    if code.startswith("4"):
      fourcode += 1
    if code.startswith("3"):
      threecode += 1
#52 mondays (or any unique day) in a year, but counting numbers down since we aren't doing EXACTLY a year
monday = monday/50
tuesday = tuesday/50
wednesday = wednesday/50
thursday = thursday/49
friday = friday/49
saturday = saturday/49
sunday = sunday/49
dayaverage=(monday+tuesday+wednesday+thursday+friday+saturday+sunday)/7
weekaverage=monday+tuesday+wednesday+thursday+friday+saturday+sunday
monthaverage = count/12 #being lazy on this one
print("There is a average of ", round(dayaverage, 2), " requests for any given day.")
print("There is a average of ", round(weekaverage, 2), " requests for any given week.")
print("There is a average of ", round(monthaverage, 2), " requests for any given month.")
print("The percentage of requests that were not successful was ", round(((fourcode/count)*100),2),"%.")
print("The percentage of requests that were redirected somewhere else was ", round(((threecode/count)*100), 2),"%.")
