##Technologies Used
Java 17 as the programming language

Spring Boot 3.5.3 as the framework

Spring Data JPA for database operations

MySQL as the database

Maven as the build tool

Lombok to reduce boilerplate code

Postman for REST API testing

Project Setup and Structure
Initial Project Configuration
The project begins with Spring Initializer setup using the following configuration:

Build Tool: Maven

Language: Java

Spring Boot Version: 3.5.3 (stable version)

Group ID: com.bhanu

Artifact ID: student-service

Package Name: com.bhanu

Packaging: JAR

Java Version: JDK 17

Required Dependencies
Four essential dependencies are added to the project:

Spring Web - for creating REST APIs

MySQL Driver - for MySQL database connectivity

Spring Data JPA - for database operations and repository management

Lombok - to generate getters, setters, and constructors automatically

Package Structure
The project follows a layered architecture approach with organized packages:

controller - for REST API endpoints and request handling

service - for business logic and operations

repository - for database operations using JPA

entity - for database table mapping classes

dto - for Data Transfer Objects (request/response objects)



##API Testing with Postman
##Complete API Endpoints
The demonstrates testing all endpoints using Postman:

1. CREATE Student

Method: POST

URL: http://localhost:8080/students/create

Body: JSON with studentName, address, marks

2. GET All Students

Method: GET

URL: http://localhost:8080/students/all

3. GET Student by ID

Method: GET

URL: http://localhost:8080/students/{studentId}

4. UPDATE Student

Method: PUT

URL: http://localhost:8080/students/{studentId}

Body: JSON with updated student information

5. DELETE Student

Method: DELETE

URL: http://localhost:8080/students/{studentId}

Testing Examples
The tutorial shows practical testing with sample data:

Creating first student:

json
{
    "studentName": "Mahash",
    "address": "Pune", 
    "marks": 90
}
Creating second student:

json
{
    "studentName": "Tushin",
    "address": "Solapur",
    "marks": 95  
}
Updating student data:

json
{
    "studentName": "Rahul",
    "address": "Mumbai",
    "marks": 85
}
