# 📌 Portfolio_05 - Premier League API

## 🚀 Project Description

This project is developed as part of our **Backend Course** and serves as a **gRPC-based backend API** for managing **2023-2024 season data** of the **Premier League**. The project is built using **Spring Boot, Hibernate, and PostgreSQL**.

## 🛠️ Technologies

The project is developed using the following technologies:

- **Java 22**
- **Spring Boot 3.1.2**
- **gRPC 1.64.0**
- **Hibernate ORM (JPA)**
- **PostgreSQL**
- **Maven**

## 🔧 Setup

Follow these steps to set up the project:

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/username/portfolio_05.git
cd portfolio_05
```

### 2️⃣ Install Dependencies and Build the Project

```sh
mvn clean install
```

### 3️⃣ Start the Database

If PostgreSQL is not installed, you can run it using Docker:

```sh
docker run --name postgres -e POSTGRES_USER=user -e POSTGRES_PASSWORD=pass -e POSTGRES_DB=football -p 5432:5432 -d postgres
```

### 4️⃣ Run the Application

```sh
mvn spring-boot:run
```

## 📡 Usage

Once the application is running, the gRPC service will be available on **port 50051**. You can connect using a gRPC client.

## 🌐 API Services

The following gRPC services are provided:

- **FootballServiceGrpcImpl** → Manages team and league data.
- **MatchServiceImpl** → Handles match information.
- **TeamServiceImpl** → Manages team details.

## 🏛️ Database Structure

The project consists of the following primary entities:

- **LeagueEntity** → League details
- **MatchEntity** → Match details
- **TeamEntity** → Team details
- **MatchStatsEntity** → Match statistics

## 🧪 Testing

The project uses **JUnit 5 and Mockito** for unit testing. Run tests using:

```sh
mvn test
```

---

🚀 **If you have any questions regarding the project, feel free to reach out through GitHub Issues!**
