# Employee Management System

## Overview

This Employee Management System is a RESTful web service built with Spring Boot. It allows for managing employee data through HTTP GET and POST requests.

## Features

- **List Employees**: Retrieve a list of all employees with a GET request.
- **Add Employee**: Add a new employee to the system with a POST request.

## Technologies

- Java 17
- Spring Boot 3.2.1
- Gradle
- JUnit and Mockito for unit testing

## Getting Started

### Prerequisites

- JDK 17
- Gradle

### Running the Application

1. Clone the repository: `git clone https://github.com/ddamme05/RESTful-Web-Service.git`
2. Navigate to the project directory: `cd RESTful_Web_Service`
3. Build the project: `./gradlew build`
4. Run the tests: './gradlew test'
5. Start the application: `./gradlew bootRun`

Alternatively, after building you can run the application using the generated jar:
`java -jar build/libs/RESTful_Web_Service-1.0-SNAPSHOT.jar`


### API Endpoints

- **GET /employees**: Returns a list of all employees.
- **POST /employees**: Adds a new employee. Requires a JSON payload with employee details.

### Example Usage

List all employees:

```sh
curl -X GET http://localhost:8080/employees`
```

Add a new employee:
```sh
curl -X POST http://localhost:8080/employees \
     -H "Content-Type: application/json" \
     -d '{
         "employeeId": "5",
         "firstName": "Eve",
         "lastName": "Adams",
         "email": "eve.adams@company.com",
         "title": "Quality Assurance"
     }'
```

### Testing
The project uses JUnit and Mockito for unit testing. Tests can be run separately using the Gradle test task.