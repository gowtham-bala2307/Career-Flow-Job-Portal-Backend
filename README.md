# CareerFlow – Job Portal Backend

CareerFlow is a Spring Boot based backend application that simulates a mini job portal system similar to Naukri or LinkedIn (backend only).

It allows recruiters to post jobs and candidates to apply and track their application status.

---

## Project Description

This project is developed as a backend system using:

- Spring Boot
- Spring Data JPA
- Hibernate
- SQL Server
- Maven

It follows a proper layered architecture:

Client → Controller → Service → Repository → Database

---

## Features

- Multi-user system (Recruiter & Candidate)
- Recruiter can post jobs
- Candidate can apply for jobs
- Application status tracking
- Role-based validation
- REST API structure
- Clean layered architecture

---

## Project Structure
com.gowtham.careerflow
│
├── controller
│ └── JobController.java
│
├── service
│ ├── JobService.java
│ └── ApplicationService.java
│
├── repository
│ ├── JobRepository.java
│ ├── UserRepository.java
│ └── ApplicationRepository.java
│
├── entity
│ ├── User.java
│ ├── Job.java
│ └── Application.java
│
├── enums
│ ├── Role.java
│ ├── JobType.java
│ └── ApplicationStatus.java
│
└── CareerflowApplication.java

---

## Database Tables

### Users
- id
- name
- email
- password
- role (RECRUITER / CANDIDATE)

### Jobs
- id
- title
- description
- location
- postedDate
- recruiter_id (Foreign Key)

### Applications
- id
- candidate_id (Foreign Key)
- job_id (Foreign Key)
- status
- appliedDate

---

## API Endpoints

### Create Job
POST /jobs/create/{recruiterId}

### Apply for Job
POST /applications/apply/{candidateId}/{jobId}

### Get Applications by Candidate
GET /applications/candidate/{candidateId}

### Get Applications by Job
GET /applications/job/{jobId}

---

## How to Run

1. Clone the repository:
   git clone https://github.com/gowtham-bala2307/Career-Flow-Job-Portal-Backend.git

2. Open the project in Eclipse or IntelliJ

3. Configure application.properties:

   spring.datasource.url=jdbc:sqlserver://localhost;databaseName=careerflow;encrypt=false
   spring.datasource.username=YOUR_USERNAME
   spring.datasource.password=YOUR_PASSWORD
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true

4. Run CareerflowApplication.java

5. Test using Postman

---

## Technologies Used

- Java 21
- Spring Boot 3
- Spring Data JPA
- Hibernate
- SQL Server
- Maven
- Postman
- Git & GitHub

---

## Future Improvements

- JWT Authentication
- Password Encryption
- Pagination
- Search functionality
- Resume upload
- Frontend integration
- Cloud deployment

---

## Author

Gowtham B
