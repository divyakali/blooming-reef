# Blooming-Reef Sentiment Analysis

Sentiment analysis using aylien.com’s sentiment analysis API

Frameworks and Tools:<br>
<li>Gradle</li>
<li>Spring Boot</li>
<li>Spring Data JPA</li>

##Usage:

The application has been deployed on Heroku. The usage is as follows:<br>

###POST https://blooming-reef.herokuapp.com/sentiment<br/>

####Body JSON:

<li>text:	string</li> 
Text to analyze
<li>url:	string</li>
Article or webpage to analyze
<li>mode:	string </li>
tweet (for short text) or document (for long text and reviews)
<li>language:	stringauto</li>
Language (refer to Language Support)

###GET https://blooming-reef.herokuapp.com/sentiment<br/>

####Query Parameters:

<li>url:	string</li>
Article or webpage to analyze


##Future:
More unit Tests and Integration tests. Testing is key to ensure that new changes do not break existing changes. 

Optional callback to POST in order to be able to post data and errors to the provided url.

Validation on parameters.

Improve documentation using swagger.

Replace persistence store. Due to time restrictions, postgres/mysql connectivity in Heroku has not been configured. The app is currently running on an in-memory db and so will lose data whenever we push to Heroku.
Once, we replace db to postgres/mysql, we will not have issues with data between multiple deployments.

##Scalability and Performance:
The code can be deployed to multiple machines with a shared db to improve performance. Currently, it is hosted on one free instance on Heroku that supports a maximum to 10 connections simultaneously.

##Screenshots:

Adding screenshots for reference:
Links to screenshots of usage<br/>
https://www.dropbox.com/s/jewa6wnvbmuu7pl/Screenshot%202016-09-18%2014.15.20.png?dl=0
https://www.dropbox.com/s/hap8azi3t0kc369/Screenshot%202016-09-18%2014.19.27.png?dl=0

##Local Setup:
You need Tomcat and JDK 1.8 installed prior to setup.
Checkout code > run ./gradlew clean build > cd build/libs> java -jar blooming-reef-0.0.1-SNAPSHOT.jar

The above should run code on your local.
Use http://localhost:9150/sentiment  from your browser.





