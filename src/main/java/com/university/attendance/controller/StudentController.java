// package com.university.attendance.controller;

// import com.university.attendance.model.Student;
// import com.university.attendance.service.StudentService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/api/students")
// public class StudentController {
//     private final StudentService studentService;
//     public StudentController(StudentService studentService) {
//         this.studentService = studentService;
//     }

//     @PostMapping
//     public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//         Student s = studentService.create(student);
//         return ResponseEntity.status(201).body(s);
//     }

//     @GetMapping
//     public ResponseEntity<List<Student>> getAllStudents() {
//         return ResponseEntity.ok(studentService.getAll());
//     }

//     @GetMapping("/{id}")
//     public ResponseEntity<?> getById(@PathVariable String id) {
//         Student s = studentService.getById(id);
//         if (s == null) return ResponseEntity.status(404).body("Student not found");
//         return ResponseEntity.ok(s);
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<?> delete(@PathVariable String id) {
//         studentService.delete(id);
//         return ResponseEntity.status(200).body("Student Deleted Success");
//     }
// }
