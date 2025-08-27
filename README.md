# 📝 Todo App (Spring Boot)

A simple yet powerful **Todo management application** built with **Spring Boot**.  
This app allows users to create, update, view, and delete tasks while also supporting due dates for better task organization.  

---

## 🚀 Features
- ✅ Create new tasks with a **title, description, and due date**  
- 📋 View all tasks  
- ✏️ Update existing tasks  
- ❌ Delete tasks  
- 📅 Manage tasks with **date fields** (`LocalDate`)  
- 🌐 RESTful API endpoints  

---

## 🛠️ Tech Stack
- **Java 17+**  
- **Spring Boot 3+**  
- **Spring Data JPA** (for database access)  
- ** Real DATABASE OR H2 Database** (in-memory, for quick setup)  
- **Maven** (build tool)  
- **Postman / Curl** (to test the API)  

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the repository
```bash
git clone https://github.com/zigiraplac/ToDoApp.git
cd ToDoApp
```

### 2️⃣ Build the project
```bash
mvn clean install
```

### 3️⃣ Run the application
```bash
mvn spring-boot:run
```

By default, the app runs at:  
👉 `http://localhost:8080`

---

## 📌 API Endpoints

### ➕ Create a Task
**POST** `/tasks`  
```json
{
  "title": "Finish The Project ",
  "description": "work on that specific feature ",
  "dueDate": "2025-09-01"
}
```

### 📋 Get All Tasks
**GET** `/tasks`

### 🔎 Get Task by ID
**GET** `/tasks/{id}`

### ✏️ Update Task
**PUT** `/tasks/{id}`  
```json
{
  "title": "Finish Todo App",
  "description": "Update task with new details",
  "dueDate": "2025-09-05"
}
```

### ❌ Delete Task
**DELETE** `/tasks/{id}`

---

## 🗄️ Database Access
This project uses an **H2 in-memory database** by default.  
You can access the H2 Console in your browser:  

👉 `http://localhost:8080/h2-console`  

Use the default JDBC URL (check `application.properties`):  
```
jdbc:h2:mem:testdb
```

---

## 🔧 Configuration
If you want to switch to MySQL or PostgreSQL, update the `application.properties` file:  

```properties
spring.datasource.url=jdbc:{YOUR_DB}://localhost:{PORT}/{YOUR_DB_NAME}
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

## 📦 Example cURL Commands

### Create Task
```bash
curl -X POST http://localhost:8080/tasks \
-H "Content-Type: application/json" \
-d '{"title": "Learn Spring Boot", "description": "Finish REST API", "dueDate": "2025-09-01"}'
```

### Get Tasks
```bash
curl -X GET http://localhost:8080/tasks
```

---

## 🤝 Contributing
Contributions are welcome! Please fork the repo and create a pull request.  

---

## 📄 License
This project is licensed under the **MIT License**.  
