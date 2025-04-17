# Smart_Stock

Smart_Stock - Week 1 Setup

Smart_Stock is a Smart Inventory Management System that helps manage stock, track products, and streamline business operations. This week covers setting up the project foundation with Spring Boot (Maven) and initializing version control with GitHub.

 ✅ Week 1 Goals

- [x] Create a GitHub repository for the project
- [x] Set up Spring Boot project using Maven
- [x] Add basic folder structure (model, repository, service, controller)
- [x] Configure MySQL connection in `application.properties`
- [x] Create the `Product` entity and test with Postman


Step-by-Step Instructions
1. Create GitHub Repository

- Repo Name: `Smart_Stock`
- Clone the repository locally:

bash
git clone https://github.com/yourusername/Smart_Stock.git
cd Smart_Stock


2. Initialize Spring Boot Project with Maven

Use [Spring Initializr](https://start.spring.io/) with the following settings:

- Project: Maven
- Language: Java
- Spring Boot Version: 3.x
- Dependencies:
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Lombok
  - Spring Boot DevTools

Download and extract into the cloned `Smart_Stock` folder.


3. Folder Structure

Create the following structure inside `src/main/java/com/smartstock/`:

├── controller/
├── model/
├── repository/
└── service/

4. MySQL Database Setup

- Create a new MySQL database:

sql
CREATE DATABASE smart_stock_db;


Update your application.properties file:

5. Create Product Entity

File: `model/Product.java`

 
6. Create ProductRepository Entity

File: `repository/ProductRepository.java`

7. Create ProductController Entity

File: `controller/ProductController.java

8. Create ProductService Entity

File: `service/ProductService.java

9. Run the Application
 using Maven:

`bash
./mvnw spring-boot:run


10. Test with Postman 

