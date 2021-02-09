# ITunesApiConnector

### An application that connects to the api, and set up own better "cleariest" endpoint for searching tracks by Author with number of tracks

## Assumptions
### The assumptions were to create a web application that would allow:
1. Connect to Api with data
2. Get Data

## Technologies and Dependecies
* JAVA language
* Spring Boot 
* H2
* Hibernate
* Thymeleaf
* Gson

## Launch
Type in your browser ```http://localhost:8080/get/{author}/{limit}```

```JAVA
@PathVariable String author // replace that variable in link your author
@PathVariable int limit // replace that variable in link your limit
```
```
Example:
http://localhost:8080/get/MileyCyrus/5
This give you```[response](#images)


## Images 
![alt text](https://i.imgur.com/KKHNSw5.png)

## Status of project: 
```diff 
+ COMPLETE
```
![alt text](https://i.imgur.com/gHaifyr.png)
