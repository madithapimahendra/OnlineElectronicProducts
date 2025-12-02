Online Electronic Products Management System

A full-stack web application built using Java Servlets, JSP, JDBC, HTML, CSS, and Oracle/MySQL.
This project provides separate modules for Admin and Customer to manage and purchase electronic products.

Features :
Admin Module
Secure admin login
Add new electronic products
Update product price and stock quantity
Delete products
View all available products



 Customer Module:
 -----------------

Customer login & authentication

View list of available products

Add products to cart

Buy selected products

Automatic bill calculation

Display final purchase summary


 
 Technologies Used
-------------------
Backend: Java, Servlets, JSP

Database: Oracle / MySQL

Frontend: HTML, CSS

Connectivity: JDBC




⚙️ How It Works (Flow)
-----------------------
➤ Admin Flow

Admin logs in

Adds/Updates/Deletes products

Products stored in database

Customers can view changed data instantly




➤ Customer Flow
------------------

Customer logs in

Selects products

System calculates total bill

Shows final bill summary

🔌 Database Tables
1. Admin Table
Column	Type
admin_id	INT
username	VARCHAR
password	VARCHAR
email varchar
mobile number varchar


3. Customer Table

Column	Type
customer_id	INT
username	VARCHAR
password	VARCHAR
Email VARCHAR
Mobiile no VARACHAR



5. Products Table
Column	TypE
PRODUCT ID NUMBER
PRODUCT NAME VARCHAR
PRODUCT COMPANY VARCHAR
PRODUCT COST VARCHAR
PRODUCT QUANTITIES


🧪 Key Functionalities
---------------------

CRUD operations on products

User authentication

Session management

Billing and quantity update

Validation and error handling

▶️ How to Run the Project

Install Tomcat Server

Create database tables

Update DB credentials in DBConnection.java

Deploy project in Eclipse / IntelliJ

Run the application on browser:

http://localhost:8080/OnlineElectronicProducts/

Future Enhancements
---------------------

Add product categories

Add cart page

Add payment gateway (dummy)

Improve UI with Bootstrap

 AuthoR
 ----------
 Madithapi MAHENDRA
Java Full Stack Developer
