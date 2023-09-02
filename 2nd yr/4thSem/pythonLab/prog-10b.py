import requests, json # importing requests and json

BASE_URL = "https://api.openweathermap.org/data/2.5/weather?" # base URL
CITY = input("Enter City name : ")
API_KEY = input("Enter your API_KEY : ") # Enter your API Key
# API_KEY = "7bdccf825b7dd119a05ac2e0afaf1aaa"
# API_KEY = "51a45f3640543d030d1e78bd52d2649c"

URL = BASE_URL + "q=" + CITY + "&appid=" + API_KEY # upadting the URL
response = requests.get(URL) # HTTP request

if response.status_code == 200: # checking the status code of the request
 data = response.json() # getting data in the json format
 main = data['main'] # getting the main dict block
 temperature = main['temp'] # getting temperature
 humidity = main['humidity'] # getting the humidity
 pressure = main['pressure'] # getting the pressure
 report = data['weather'] # weather report
 print(f"{CITY:-^30}")
 print(f"Temperature: {temperature}")
 print(f"Humidity: {humidity}")
 print(f"Pressure: {pressure}")
 print(f"Weather Report: {report[0]['description']}")
else:
 print("Error in the HTTP request") # showing the error message


'''10.b.Fetch weather data from the JSON
Write a python program to fetch current weather data from the JSON file'''