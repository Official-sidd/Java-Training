# AI Job Recommendation API (Spring Boot POC)

## Overview

This project is a **Spring Boot REST API** that allows users to create and manage job postings and receive **AI-style job recommendations based on skills**.

The system stores job data in a **PostgreSQL database** and provides REST endpoints to perform CRUD operations and generate recommendations.

Instead of calling external AI APIs, this proof-of-concept implements a **skill-based recommendation engine** that matches user skills with job postings stored in the database.

---

## Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- ModelMapper
- Lombok
- Maven
- Postman (API testing)

---

## Features

- Create Job Posts
- Fetch Job Posts
- Delete Job Posts
- Skill-based Job Recommendation
- DTO Validation
- Global Exception Handling
- Logging
- Environment Variable Configuration

---

## API Reference

### Base URL
http://localhost:8080


---

## API Summary

| Method | Endpoint | Description |
|------|------|------|
| POST | /jobs | Create a new job post |
| GET | /jobs | Retrieve all job posts |
| GET | /jobs/{id} | Retrieve a specific job |
| DELETE | /jobs/{id} | Delete a job post |
| POST | /jobs/recommend | Get job recommendations based on skills |

---

### Endpoints
GET /jobs
GET /jobs/{id}
POST /jobs
DELETE /jobs/{id}

### Request Body
json
{
  "title": "Java Backend Developer",
  "description": "Develop REST APIs using Spring Boot",
  "skills": "Java,Spring Boot,PostgreSQL,Docker",
  "experience": 3
}

{
  "id": 1,
  "title": "Java Backend Developer",
  "description": "Develop REST APIs using Spring Boot",
  "skills": "Java,Spring Boot,PostgreSQL,Docker",
  "experience": 3
}

## Project Structure
ai-job-api/
│
├── controller
│     JobController.java
│
├── service
│     JobService.java
│     AIService.java
│
├── repository
│     JobRepository.java
│
├── entity
│     JobPost.java
│
├── dto
│     JobPostDTO.java
│
├── exception
│     GlobalExceptionHandler.java
│
├── config
│     ModelMapperConfig.java
│
└── Application.java