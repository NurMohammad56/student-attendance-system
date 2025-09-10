// package com.university.attendance.controller;

// import com.university.attendance.model.Course;
// import com.university.attendance.service.CourseService;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import java.util.List;

// @RestController
// @RequestMapping("/api/courses")
// public class CourseController {
//     private final CourseService courseService;
//     public CourseController(CourseService courseService) {
//         this.courseService = courseService;
//     }

//     @PostMapping
//     public ResponseEntity<Course> createCourse(@RequestBody Course course) {
//         Course c = courseService.create(course);
//         return ResponseEntity.status(201).body(c);
//     }

//     @GetMapping
//     public List<Course> getAll() {
//         List<Course> courses = courseService.getAll();
//         return courses;
//     }

//     @GetMapping("/{id}")
//     public ResponseEntity<?> getById(@PathVariable String id) {
//         Course c = courseService.getById(id);
//         if (c == null) return ResponseEntity.status(404).body("Course not found");
//         return ResponseEntity.ok(c);
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<?> deleteById(@PathVariable String id){
//         Course c = courseService.delete(id);
//         return ResponseEntity.status(200).body("Course deleted success")
//     }
// }


