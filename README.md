# CarRentalProject 

CarRental Project by RobMac 

This project involves use of project management: GIT, databases: MySQL, programming fundamentals: Java, API development: SpringBoot and automated testing: JUnit/Mockito.  The below and attached details the CarRental System back end-end system, for simplification at this stage it is split into booking and car tables.  It uses Java Spring Boot and it could be linked to front end.  It has various CRUD (Create, Read, Update, Delete) functionalities to maintain the system and keep it updated. It is split into two tables. A table for bookings and a table for vehicles/cars. This system is designed for companies to make it more convenient for them store, update and maintain booking and vehicle data. This README is an overview of the project. 


Key data components: 

1-Booking: 

*view uniquebookingnumber 

*view bookingdate 

*view vehicletype 

*view carnumber 

*update booking 

*delete booking 

*update bookingstatus 

*update numberofdays 

 

2-Cars: 

* view carstatus 

*update carstatus 

*view model 

*view carnumber 

*view cardatepurchased 

*view carlocation 

  

Project Structure: 

* Attached is an outline of the project structure: 


![OverviewOfProject](https://user-images.githubusercontent.com/112032858/198878533-edc52dcf-0ddc-402c-99eb-ef255be0635e.png)



Database: 

* An ERD diagram is made for the database table.  Primark keys were established (PK), where the PK is a) unique b) never changing, and c) never null.  This meant that the Booking PK is uniquebooking number and Car PK is carnumber. 

* The tables can be linked together through the carnumber primary key. 

 

Execution using Postman - CRUD, create, read, update, delete.  Sometimes the Postman may return error messages and it's important to try and understand the meaning, reason for this.  Fro example, the data not existing or using the incorrect instructions combined with the url.  At this level, the main postman methods are: GET(read) POST(add) PUT(update) DELETE(delete).


  ![404NotFound](https://user-images.githubusercontent.com/112032858/198879261-56ee9ce1-55bb-4d39-9d1a-ff33c9681958.png)
  
  
  ![Screenshot 2022-10-29 at 22 58 11](https://user-images.githubusercontent.com/112032858/198879296-29034db9-1031-4619-8e03-4eae4cb5114b.png)

  
  
  ![Screenshot 2022-10-29 at 22 19 14](https://user-images.githubusercontent.com/112032858/198879283-e307a447-77a9-480c-a807-5de67b68a0d4.png)



  

Using Spring Boot, key points: 

*It is important to run the application as springboot and check there are no errors at start. 

*Port 8080 should be used
![TomCatStart](https://user-images.githubusercontent.com/112032858/198878607-7e2b662a-2989-44d7-801b-7b8d41b47414.png)


*Checking the tomcat is running should indicate whether the application is successful to start and run. 

  

Testing: JUnit is used for testing the API's in source code, often using the data classes, which requires using mockito for creating duplicate or dummy objects.

  

My learning so far:  time was limited for this project, so I would have liked some more time to expand on the ideas and get some further assistance.  I am grateful for the help I received.  I have learned a lot more about grammar errors, instructional/coding errors in java.   Now I know the importance and significance of using data types in java, how to find errors from the consoles output and how to make sure input data of service corresponds to controller and repository.  

 
