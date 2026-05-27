<img width="1483" height="917" alt="Screenshot 2026-05-27 at 3 50 11 PM" src="https://github.com/user-attachments/assets/1ec2f261-9f87-46e5-98a2-e7cc67869498" />Employee Management System (EMS)

A full-stack Employee Management System built using Java, Spring Boot, MySQL, and modern frontend technologies. The application helps organizations efficiently manage employee records, salary processing, authentication, and administrative operations through a secure and responsive dashboard.

🚀 Features
🔐 Authentication & Security
JWT-based Authentication
Role-Based Access Control (ADMIN / EMPLOYEE)
Secure Login System
Spring Security Integration

👨‍💼 Employee Management
Add New Employees
View All Employees
Delete Employees
Employee Details Management
Department & Salary Tracking
Responsive Employee Dashboard

💰 Salary Management
Generate Salary Slips
Basic Salary Calculation
HRA, Bonus & Deduction Handling
View All Salary Slips
Admin-Controlled Payroll System

📊 Dashboard
Modern Admin Dashboard UI
Employee Statistics
Salary Slip Analytics
Interactive User Experience
Responsive Design for Mobile & Desktop

🛠️ Tech Stack
Backend
Java
Spring Boot
Spring Security
Spring Data JPA
Hibernate
JWT Authentication
Maven
Frontend
HTML5
CSS3
JavaScript
Glassmorphism UI Design
Responsive Dashboard
Database
MySQL

📂 Project Structure
Employee-Management-System/
│
├── backend/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│   ├── dto/
│   ├── security/
│   └── config/
│
├── frontend/
│   ├── login.html
│   ├── dashboard.html
│   ├── style.css
│   └── script.js
│
├── pom.xml
└── README.md
⚙️ Installation & Setup
1️⃣ Clone Repository
git clone (https://github.com/itsVedant24/Employee_Management_System/)
2️⃣ Open Project

Open the project in:

IntelliJ IDEA
VS Code
Eclipse
3️⃣ Configure MySQL

Create database:

CREATE DATABASE ems_db;
4️⃣ Update application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
5️⃣ Install Maven Dependencies
mvn clean install
6️⃣ Run Spring Boot Application
mvn spring-boot:run

Backend runs on:

http://localhost:8080
7️⃣ Run Frontend

Open:

login.html

using:

Live Server
IntelliJ Built-in Server

Frontend runs on:

http://localhost:63342

🔑 Default Admin Credentials
Username : admin
Password : admin123

🧪 API Endpoints
Authentication
Method	Endpoint	Description
POST	/api/auth/login	User Login
Employee APIs
Method	Endpoint
GET	/api/employees
POST	/api/employees
DELETE	/api/employees/{id}
Salary APIs
Method	Endpoint
POST	/api/salary/generate
GET	/api/salary/all

<img width="1483" height="917" alt="Screenshot 2026-05-27 at 3 50 11 PM" src="https://github.com/user-attachments/assets/b700b133-0573-4461-bc0e-4267079201a0" />



<img width="1699" height="698" alt="Screenshot 2026-05-27 at 3 49 55 PM" src="https://github.com/user-attachments/assets/140c071a-93d9-4eef-97a6-6b8778dcbb1d" />
