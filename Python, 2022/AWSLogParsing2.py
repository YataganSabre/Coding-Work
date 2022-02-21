import re
import datetime as d
import urllib.request
import os.path
#checks to see if the file exists, if it does NOT exist, download it and countine running.
if not(os.path.isfile('awslog.txt')):  
  print('You do not have the file, beginning file download with urllib2...')
  url = 'https://s3.amazonaws.com/tcmg476/http_access_log'
  urllib.request.urlretrieve(url, 'awslog.txt')
  print('File downloaded, resuming program.')
# Opening aws log
file = open("awslog.txt","r")
# Reading from file
Content = file.read() 
# Splitting list by new lines (each line is a different request)
CoList = Content.split("\n")
#closing it since we're done with it now
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
  for i in CoList:
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

    

r = 'local - - [24/Oct/1994:13:41:41 -0600] "GET index.html HTTP/1.0" 200 150'
regex = re.compile("(.*?) - - \[(.*?):(.*) .*\] \"[A-Z]{3,6} (.*?) HTTP.*\" (\d{3}) (.+)")
pieces = re.split(regex, r)
date = d.datetime.strptime(pieces[2], '%d/%b/%Y')
print(date)
print(d.datetime.weekday(date))