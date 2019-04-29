# javalin-kotlin-gradle-heroku

### A simple project to demonstrates how to deploy a Kotlin + Javalin + Gradle application on Heroku 

[![Build Status](https://travis-ci.org/lennonjesus/javalin-kotlin-gradle-heroku.svg?branch=master)](https://travis-ci.org/lennonjesus/javalin-kotlin-gradle-heroku)
[![Code Climate](https://codeclimate.com/github/lennonjesus/javalin-kotlin-gradle-heroku/badges/gpa.svg)](https://codeclimate.com/github/lennonjesus/javalin-kotlin-gradle-heroku)

### Requirements
You should have Git, Java, Gradle and Heroku-cli installed.


### Clone this repo
```
$ git clone https://github.com/lennonjesus/javalin-kotlin-gradle-heroku.git && cd javalin-kotlin-gradle-heroku 
```

### Test on local machine

#### Run project (it will download dependencies, compile sources and start the server)
```
$ gradle run
```

#### Open your favorite browser...
```
http://localhost:7000
```

#### ...or use cURL on a terminal...
```
$ curl http://localhost:7000
```

#### ...and you should get this response
```
Hello Javalin with Kotlin on Heroku!
```

#### Stop the server
```
$ gradle --stop
```

### Deploy and test on heroku

### Create new Heroku project
```
$ heroku create
```

### Deploy to Heroku
```
$ git push heroku master
```

### Scale up
```
$ heroku ps:scale web=1
```

#### Open your favorite browser...
```
$ heroku open
```

#### ...or use cURL on a terminal...
```
$ curl https://[HEROKU-PROJECT-NAME-GOES-HERE].herokuapp.com
```

#### ...and you should get this response
```
Hello Javalin with Kotlin on Heroku!
```
