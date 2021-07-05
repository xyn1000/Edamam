# Exam Pre-work

### Configuration
Before running the app, modify src/main/java/exam/Constants.java.

`app_id` - Edamam API id

`app_key` - Edamam API key

`sendGridToken` - SendGrid token

`senderEmail` - SendGrid sender email address

`senderName` - SendGrid email sender name

`receiverEmail` - SendGrid receiver email address

`receiverName` - SendGrid receiver name

The database is `edamam.sqlite` and the database-creation statements are stored in `db.sql`.


### How to Run

gradle run --args="offline online"
`or`
gradle run --args="online offline"
`or`
gradle run --args="online online"
`or`
gradle run --args="offline offline"


the first argument controlls the input API, and the second one controlls the output API.

### Level
The level of features is `CREDIT`.


### Citations
 In main/java/exam/util/DBUtil.java, I hava used some code from following websites:
* https://commons.apache.org/proper/commons-dbcp/apidocs/org/apache/commons/dbcp2/BasicDataSource.html
* https://examples.javacodegeeks.com/core-java/apache/commons/dbcp/dbcp-connection-pooling-example/
* https://examples.javacodegeeks.com/core-java/apache/commons/org-apache-commons-dbcp2-basicdatasource-example/


In main/java/exam/controller/ChooseMeasureController.java & FoodResultsController.java, I refer to some code from my assignment 2 of SOFT2412. The locations are:
ChooseMeasureController.java - Line 168 to Line 229.
FoodResultsController.java - Line 138 to Line 180.


### Dummy API
The dummy API will return the information in the database. 
When a user search through online API, the information will be saved to the database. 
If the database doesn't store anyting yet, the user can search for "apple" to get some information about "apple" from dummy API.


###  Test-Driven Development process 
- 1

`Tests for Data Access Object`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/c467e5571c98505ff9541da472b7df72c2558c60
`Implementation of DAO`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/01baa1d619abae3d47588e4bc4bcb2cf5b0e473f
`Refactor the tests`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/b07f62e826825babb914f4c56788973c974e676c
`Refactor the code`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/db68dbcbe54dc35a5444bfa7174af581f0019a85


- 2

`Tests for JSON Utility class`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/a968f9b5d2a049519c6a4f57df04eed96aabe565
`Implementation of JSON Utility class`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/f2956af3fe31c6b0fa2fa58f4eecb1b23b815a23

- 3

`Tests for output service class`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/a3e7cbb681486ffb5b7f8eba1af3d03f375623c9
`Implementation of Output service`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/fff0664f33b14be30871b811209a585015a1cb1a

- 4

`Tests for input service class`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/654cd5d54a14c16d8ca24d0219f304a4dfd21496
`Implementation of input service`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/dcacd5ace736811753a82f348f4d4b9b8fd254f8


- 5

`Tests for Database utility class`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/c7ed38d7753f835eb32b3e3ab730778cc1f67532

`Implementation of Database utility class`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/493eb7dd7071c499ca6746abc973691c4870177f

- 6

`Tests for Dummy API`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/a359d207a538d46d7a94c7546c201d1e72f17265

`Implementation of Dummy API`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/50b547af9ede8922bd4ac987e039d298786c21ac


- 7

`Add test for Extension`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/3abed2be294fb1a9b369bbdf9ca3b65edc135f29

`Implementation of Extension`
https://github.sydney.edu.au/yxio2030/SCD2_2021_Exam/commit/24d89234002c18c87108775c2c83de25612b11e9


### Simple Extension
I apply for the simple extension in this pre-work.

