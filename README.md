

<h1 align="center" style="color:#1976D2;font-size:2.8em;margin-bottom:0">QuizApp Backend</h1>

<p align="center" style="color:#555;">
  <b>Backend Quiz Application — Monolithic and Microservices Implementations (Spring Boot, Maven, SQL)</b>
  <br>
  <a href="#introduction">Introduction</a> •
  <a href="#features">Features</a> •
  <a href="#tech-stack">Tech Stack</a> •
  <a href="#project-structure">Project Structure</a> •
  <a href="#getting-started">Getting Started</a>
</p>

<!-- Badges Row -->
<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.7.0-%236DB33F?logo=springboot" />
  <img src="https://img.shields.io/badge/Maven-white?logo=apache-maven" />
  <img src="https://img.shields.io/badge/Java-17-%23f89820?logo=java" />
  <img src="https://img.shields.io/badge/Microservices-%234FC3F7?logo=microgen" />
  <img src="https://img.shields.io/badge/SQL-%23007ACC?logo=database" />
</p>

---

<h2 id="introduction" style="color:#1976D2;">💡 Introduction</h2>
<p>
  <b>QuizApp</b> provides a comprehensive backend solution for quiz management, implemented in two variations:
  <ul>
    <li><b>Standard Monolithic Backend</b> — A classic Spring Boot REST API for quizzes, suitable for fast deployment and direct integration.</li>
    <li><b>Microservices Architecture</b> — Decomposed quiz platform leveraging Spring Boot microservices, enabling scalability and allowing each core component (Quiz, Question, User, etc.) to evolve independently.</li>
  </ul>
  Both versions are backend-only and tested using <b>Postman</b> collections. The system offers a strong foundation for quiz-based applications or as a microservices Java reference project.
</p>

---

<h2 id="features" style="color:#1976D2;">✨ Features</h2>
<ul style="font-size:1.1em;">
  <li>Quiz and Question management (CRUD via REST endpoints)</li>
  <li>Basic user and result management (as implemented)</li>
  <li>Microservices variant includes service separation (Quiz, Question, Result, etc.)</li>
  <li>Secure configuration and integration with relational databases</li>
  <li>Stateless backend suitable for integration with any frontend or API consumer</li>
  <li>Fully testable via Postman, with example collections (not included in repo)</li>
</ul>

---

<h2 id="tech-stack" style="color:#1976D2;">🛠️ Tech Stack</h2>
<table>
  <tr><td><b>Backend</b></td><td>Java, Spring Boot, Spring Data JPA, Maven</td></tr>
  <tr><td><b>Microservice</b></td><td>Spring Boot (per service), Spring Cloud (if present), Eureka/Discovery (if present)</td></tr>
  <tr><td><b>Database</b></td><td>SQL (H2/MySQL/Other as configured)</td></tr>
  <tr><td><b>Testing</b></td><td>Postman for API validation</td></tr>
</table>

---

<h2 id="project-structure" style="color:#1976D2;">📂 Project Structure</h2>

<p>
The repository contains two main folders:
</p>

<pre>
QuizApp/
│
├── QuizApp/                # Monolithic backend Spring Boot quiz application
│   ├── src/
│   │   ├── main/java/com/quizapp/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── QuizAppApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   └── pom.xml
│
├── QuizApp-Microservices/  # Microservices architecture version
│   ├── quiz-service/
│   ├── question-service/
│   ├── result-service/
│   ├── ... (other service folders)
│   └── common-configs/
│
└── README.md
</pre>

---

<h2 id="getting-started" style="color:#1976D2;">🚀 Getting Started</h2>
<details>
<summary><b>Click to expand → Running the Project</b></summary>

1. <b>Clone the repository:</b>
   <pre>git clone https://github.com/shubhk7781/QuizApp.git && cd QuizApp</pre>
2. <b>Monolithic version:</b>
   <pre>
cd QuizApp
mvn clean install
mvn spring-boot:run
   </pre>
3. <b>Microservices version:</b>
   <pre>
cd QuizApp-Microservices
# Go into each microservice folder and run:
mvn clean install
mvn spring-boot:run
   </pre>
   (Start dependencies like Eureka/zookeeper, MySQL, etc. if configured.)
4. <b>Test via Postman:</b>
   <ul>
     <li>Use the documented REST endpoints as described in each service/controller.</li>
     <li>Adjust URLs/ports as configured for each microservice.</li>
   </ul>
</details>

---

<p align="center">
  <img src="https://raw.githubusercontent.com/shubhk7781/QuizApp/main/assets/quizapp-illustration.png" alt="QuizApp Illustration" width="180" style="border-radius:12px;">
</p>
