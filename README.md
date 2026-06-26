# 🌾 Smart Agri Inventory Management System

## 📌 Project Overview

The **Smart Agri Inventory Management System** is a Full Stack Web Application developed to efficiently manage agricultural inventory, suppliers, purchases, sales, and stock monitoring. The system provides secure user authentication, inventory analytics, low stock alerts, and a user-friendly dashboard to simplify agricultural inventory management.

---

# 🎯 Objectives

* Manage agricultural inventory efficiently.
* Track suppliers and purchased products.
* Record product sales.
* Monitor available stock.
* Generate inventory analytics and sales reports.
* Provide secure authentication using Spring Security.

---

# 🚀 Features

## 🔐 Authentication

* User Registration
* Secure User Login
* Password Encryption using BCrypt
* Spring Security Authentication
* MySQL User Authentication

## 📦 Inventory Management

* Add Products
* View Product List
* Search Products
* Update Inventory Automatically

## 🚜 Supplier Management

* Add Suppliers
* View Supplier List

## 🛒 Purchase Management

* Record Product Purchases
* Store Purchase History

## 💰 Sales Management

* Record Product Sales
* Maintain Sales Records

## 📊 Stock Monitoring

* Current Inventory
* Low Stock Alerts
* Inventory Analytics
* Forecast Dashboard
* Sales Reports

---

# 💻 Technology Stack

## Frontend

* HTML5
* CSS3
* JavaScript

## Backend

* Spring Boot
* Spring MVC
* Spring Data JPA
* Spring Security
* REST API

## Database

* MySQL

## API Testing

* Postman

## Build Tool

* Maven

## Version Control

* Git
* GitHub

---

# 📁 Project Structure

```text
src/main/java
│
├── config
│   ├── PasswordConfig
│   └── SecurityConfig
│
├── controller
│   ├── ProductController
│   ├── SupplierController
│   ├── PurchaseController
│   ├── SalesController
│   ├── InventoryController
│   └── UserController
│
├── entity
│   ├── Product
│   ├── Supplier
│   ├── Purchase
│   ├── Sales
│   ├── Inventory
│   └── User
│
├── repository
│   ├── ProductRepository
│   ├── SupplierRepository
│   ├── PurchaseRepository
│   ├── SalesRepository
│   ├── InventoryRepository
│   └── UserRepository
│
├── service
│   └── CustomUserDetailsService
│
└── AgriInventoryApplication
```

---

# 🗄️ Database Tables

* users
* products
* suppliers
* purchases
* sales
* inventory

---

# 🌐 REST APIs

## Authentication

* POST /auth/register
* POST /auth/login

## Products

* POST /products
* GET /products
* GET /products/search/{name}

## Suppliers

* POST /suppliers
* GET /suppliers

## Purchases

* POST /purchases
* GET /purchases

## Sales

* POST /sales
* GET /sales

## Inventory

* GET /inventory

---

# 📈 Advanced Features

* Secure Authentication using Spring Security
* BCrypt Password Encryption
* Inventory Analytics Dashboard
* Low Stock Alert
* Sales Report
* Forecast Dashboard
* Responsive Frontend
* RESTful API Architecture

---

# 🧪 Testing

All backend APIs were tested successfully using Postman.

Verified APIs:

* User Registration
* User Login
* Add Product
* View Products
* Search Product
* Add Supplier
* View Suppliers
* Add Purchase
* View Purchases
* Add Sale
* View Sales
* Inventory Details

---

# ▶️ How to Run the Project

## Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/agriinventory.git
```

## Open the Project

Open the project in IntelliJ IDEA.

## Configure MySQL

Create a MySQL database.

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/agriinventory
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
```

## Run

Run `AgriInventoryApplication.java`.

Open:

```
http://localhost:8080/login.html
```

---


# 👨‍💻 Developer

**Jason J**

Artificial Intelligence and Data Science (AI & DS)

Full Stack Developer | Java | Spring Boot | MySQL

---

# 📜 License

This project was developed for educational and internship purposes.
