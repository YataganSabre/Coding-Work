import requests

#urlbase = input("Enter the hostname(including https), if you mess it up i'm not doing anything helpful:")
urlbase = 'https://test-enviroment.yatagansabre.repl.co'

#initial user input
print("Beep Boop. Select a program via typing it in from this list.")
go = True
while go == True:
  endpoint = str(input("[md5],[factorial],[fibonacci],[is-prime], [slack-alert], [keyval]"))
  allowedchoices = ["md5", "factorial", "fibonacci", "is-prime", "slack-alert", "keyval"]
  if endpoint in allowedchoices:
    print("Request Recieved.")
    go = False
  else:
    print("ERROR " + endpoint + " is not a valid option. Try again.")


    
#normal tester  
def tester(endpoint, userin):
  url = urlbase + '/' + endpoint + '/' + userin
  req = requests.get(url) #posts the url and then takes the "output" to variable r
  if req.status_code == 200:
    try:
      r = req.json() #converts it to a diciontary
    except:
        return False
    return r["output"]
  else:
    return False
    
def keytester(jload, endpoint, userin, method):
  #combines everything to function
  if userin == None:
    userin = ''
  url = urlbase + '/' + endpoint + userin
  #print(url) #placeholder, here to make sure it works
  if(method == "POST"):
    req = requests.post(url, json=jload)
  elif(method == "GET"):
    req = requests.get(url)
  elif(method == "PUT"):
    req = requests.put(url, json=jload)
  elif(method == "DELETE"):
    req = requests.delete(url)
  r = req.json()
  if req.status_code == 200:
    if method == "GET":
      return r["value"]
    return r["result"]
  else:
    return r["error"]

    
#specific input for non keyval stuff
if not (endpoint == "keyval"):
  endgo = True
  while endgo == True:
    userin = input("Enter a appropriate input for that program.")
    if tester(endpoint, userin):
      print("The outcome of " + endpoint + " is: " + str(tester(endpoint, userin)))
      endgo = False
    else:
      print("ERROR " + userin + " is not a valid input for the endpoint " + endpoint)
elif endpoint == "keyval":
  methgo = True
  while methgo == True:
    method = str(input("[POST],[GET],[PUT],[DELETE]"))
    allowedmethods = ["POST", "GET", "PUT", "DELETE"]
    if method in allowedmethods:
      print("Method Recieved")
      jload = None
      userin = None
      if method == "DELETE" or method == "GET":
        userin = str(input("What key would you like to mess with?"))
        userin = "/" + userin
      if method == "POST" or method == "PUT":
        userkey = str(input("Enter a JSON Key."))
        uservalue = str(input("Enter a JSON Value."))
        jload = {"key": userkey, "value": uservalue}
      if keytester(jload, endpoint, userin, method):
        methgo = False
