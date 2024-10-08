This is a RESTful API built using Spring Boot that allows you to manage courses. The data is stored in MongoDB, and the API supports creating, retrieving, updating, and deleting courses.

Features
Add a Course: Create a new course with details like name, description, and instructor.
Retrieve All Courses: Fetch all the courses stored in MongoDB.
Update a Course by ID: Update an existing course's information using its ID.
Delete a Course by ID: Delete a course from the database by its ID.
Technologies Used
Java: Backend logic
Spring Boot: Framework for building the REST API
MongoDB: NoSQL database for storing course information
Spring Data MongoDB: For interacting with MongoDB
Lombok: Reduces boilerplate code for models (Optional)
Maven: For dependency management
Before you begin, make sure you have the following installed:

Java 8+
Maven
MongoDB
Getting Started
1. Clone the Repository
bash
Copy code
git clone https://github.com/Nikhilesh144/course-management-api.git
cd course-management-api
2. Configure MongoDB
Ensure that MongoDB is running on your local machine. By default, the application will connect to MongoDB at localhost:27017. You can change this in the src/main/resources/application.properties file:

properties

spring.data.mongodb.uri=mongodb://localhost:27017/courseDB
3. Build the Application
Use Maven to build the project:
mvn clean install
4. Run the Application
After building, you can run the Spring Boot application:
mvn spring-boot:run
The API will now be accessible at http://localhost:8080/api/courses.
