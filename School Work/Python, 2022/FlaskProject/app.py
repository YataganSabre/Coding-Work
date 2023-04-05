from flask import Flask, jsonify, abort, request
import hashlib
import requests
import redis
app = Flask('app')
r = redis.StrictRedis(host="redis-server", port=6379, charset="utf-8", decode_responses=True)
#r = redis.StrictRedis(host="34.125.223.20", port=80, charset="utf-8", decode_responses=True)
#test

@app.route('/')
#sets the default page, we may remove this later
def hello_world():
    return 'This is the opening page'


#takes a string from the url and converts to a hashcode (Problem 1)
@app.route('/md5/<string>', methods=['POST', 'GET'])
def md5machine(string):
    #hashes it
    hashed = hashlib.md5(string.encode())
    md5thing = hashed.hexdigest()
    output = {
      "input": string,
      "output": md5thing
    }
    return jsonify(output)


@app.route('/factorial/<num>', methods=['POST', 'GET'])  #i don't know how to make exceptions WITHIN the url, so what i'm going to do is take any possible item from the user and then see if it works within normal python code
def fact(num):
    try:  #this exists incase they put in a string, and catches it and makes a different error message then if they had inserted a bad number.
        num = float(num)
    except:
        abort(404, description = "You muster insert a number!")
    #okay so in order to check if its a int, we actually do need to make it a float which i know is weird but trust me
    intcheck = num.is_integer()
    if num >= 0 and intcheck:  #for this i'm going to say that 0 counts as a positive, since 1 is the factorial of 0
        fact = 1
        if num == 0:
            result = 1
        else:
            for i in range(1, int(num) + 1):
                fact = fact * i
            #in order to exist in the stame return statement, values are shifted from a number to a string, with num having int first so it loses its decimal places
            result = fact

    else:
        abort(404, description = "This value must be greater then or equal to 0!")
    output = {"input": num,"output": result}
    return jsonify(output)


@app.route('/fibonacci/<int:n>', methods=['POST', 'GET'])
def calcfib(n):
    fiblist = []
    n1, n2 = 0, 1

    # check if the number of terms is valid
    if n <= 0:
        abort(404, description = "This value must be greater then 1.")
    # if there is only one term, return n1
    # generate fibonacci sequence
    else:
        while n >= n1:
            nth = n1 + n2
            # update values
            fiblist.append(n1)
            n1 = n2
            n2 = nth
        result = fiblist
    output = {"input": n,"output": result}
    return jsonify(output)


@app.route('/is-prime/<number>',  methods=['POST', 'GET'])
def prime(number):
    # reusing some parts of the code from the factorial section, as it is effective and useful for the prime section
    try:
        number = int(number)
    except:
        abort(404, description = "This value is not a number.")
    if number == 1:
      result = False
    elif number > 1:
        for i in range(2, int(number / 2) + 1):
            if (number % i) == 0:
                result = False
                break
        else:
            result = True
    else:
        abort(404, description = "This value is less then 1, which is not valid.")
    output = {"input": number,"output": result}
    return jsonify(output)
    
@app.route('/slack-alert/<message>', methods=['POST', 'GET'])
def slack(message):
  url = 'https://hooks.slack.com/services/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'
  try: 
    requests.post(url, json={'text': message})
    result = True
  except:
    abort(404, description = "Slack message failed to send!")
  output = {"input": message,"output": result}
  return jsonify(output)

# POST function
@app.route('/keyval', methods=['POST'])
def keypost():
  payload = request.get_json()
  returnload = {
    "key": "",
    "value": "",
    "command": "",
    "result": "",
    "error": ""
}  
  if payload == None:
    returnload["command"] = f"POST / "
    returnload["result"] = False
    returnload["error"] = "This is not a valid JSON."
    return returnload, 400
  if payload.get('key', None) == None or payload.get('value', None) == None:
    returnload["command"] = f"POST / "
    returnload["result"] = False
    returnload["error"] = "This must contain both a key and a value"
    return returnload, 400
  k = payload['key']
  v = payload['value']
  if r.exists(payload["key"]):
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"CREATE {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "This key already exists"
    return returnload, 409
  redis_result = r.set(k, v)
  if not redis_result:
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"CREATE {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "Error writing to database"
    return returnload, 400
  else:
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"CREATE {k}/{v}"
    returnload["result"] = True
    r.set(k, v)
    return returnload, 200

# GET function
@app.route('/keyval/<input>', methods=['GET'])
def keyget(input):
  returnload = {
    "key": "",
    "value": "",
    "command": "",
    "result": "",
    "error": ""
              }
  k = input
  if k == "":
    v = ""
    v = r.get(input)
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"GET {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "Bad user input."
    return returnload, 400
  if not r.exists(input):
    v = ""
    v = r.get(input)
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"GET {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "This key does not exist"
    return returnload, 404
  else :
    v = r.get(input)
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"GET {k}/{v}"
    returnload["result"] = True
    return returnload, 200
  
#PUT Function
@app.route('/keyval', methods=['PUT'])
def keyput():
  payload = request.get_json()
  returnload = {
    "key": "",
    "value": "",
    "command": "",
    "result": "",
    "error": ""
}  
  if payload == None:
    returnload["result"] = False
    returnload["command"] = f"PUT / "
    returnload["error"] = "This is not a valid JSON."
    return returnload, 400
  if payload.get('key', None) == None or payload.get('value', None) == None:
    returnload["result"] = False
    returnload["command"] = f"PUT / "
    returnload["error"] = "This must contain both a key and a value"
    return returnload, 400
  k = payload["key"]
  v = payload['value']
  if not r.exists(k):
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"PUT {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "This key does not exist, so it may not be replaced."
    return returnload, 409
  elif r.exists(k):
    redis_result = r.set(k, v)
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"PUT {k}/{v}"
    returnload["result"] = redis_result
    return returnload, 200

# Delete function
@app.route('/keyval/<input>', methods=['DELETE'])
def keydel(input):
  returnload = {
    "key": "",
    "value": "",
    "command": "",
    "result": "",
    "error": ""
              }
  k = input
  if k == "":
    v = ""
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"DEL {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "Bad user input."
    return returnload, 400
  if not r.exists(input):
    v = ""
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"DEL {k}/{v}"
    returnload["result"] = False
    returnload["error"] = "This key does not exist, so it may not be deleted."
    return returnload, 404
  else :
    v = r.get(input)
    returnload["key"] = k
    returnload["value"] = v
    returnload["command"] = f"DEL {k}/{v}"
    returnload["result"] = True
    r.delete(k)
    return returnload, 200



app.run(host='0.0.0.0', port=5000)
