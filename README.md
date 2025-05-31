# 🛒 Order & Inventory Microservice System

This project is a simple simulation of how online stores handle orders and update inventory. It uses **Java (Spring Boot)** to build two separate backend services:

1. **Order Service** – where new customer orders are received.
2. **Inventory Service** – which updates stock whenever an order is placed.

The two services talk to each other using **Apache Kafka**, a tool that lets them send and receive messages without being directly connected. Everything runs in isolated containers using **Docker Compose**, making it easy to set up and test locally.

---

## 📌 Features

- 🔄 Two independent services: one for handling orders and one for updating inventory
- 🌐 REST API for placing new orders
- 📬 Kafka for sending messages between services
- 🧱 Built with Spring Boot for simplicity and modular design
- 🐳 Docker Compose to run everything together easily
- ⚙️ Logs show real-time order and inventory activity

## ⚙️ Tech Stack

| Layer                | Technology                        |
|---------------------|------------------------------------|
| Language             | Java 17                            |
| Framework            | Spring Boot                        |
| Messaging Queue      | Apache Kafka                       |
| API Style            | RESTful API                        |
| Containerization     | Docker, Docker Compose             |
| Monitoring           | Logging via Spring Boot SLF4J      |


