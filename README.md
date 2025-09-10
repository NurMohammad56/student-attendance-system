# Student Attendance System

Simple balanced backend for university project.

## Run

1. Start MongoDB locally (or use Atlas).
2. `mvn spring-boot:run`
3. Server: `http://localhost:8080`

## Postman Documentation
Link: https://documenter.getpostman.com/view/42737621/2sB3HnMLr1

## Endpoints (examples)

- POST /api/students
  - body: {"name":"John","email":"john@x.com","rollNumber":"2025-01"}
- GET /api/students

- POST /api/courses
  - body: {"code":"CSE101","title":"Intro to CS"}
- GET /api/courses

- POST /api/attendance/mark

  - body: {"studentId":"...","courseId":"...","date":"2025-09-08","status":"PRESENT"}

- GET /api/attendance/student/{studentId}
- GET /api/attendance/course/{courseId}
- GET /api/attendance/course/{courseId}/date/{yyyy-MM-dd}
