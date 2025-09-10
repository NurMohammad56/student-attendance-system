package com.university.attendance.controller;

import com.university.attendance.model.AttendanceRecord;
import com.university.attendance.model.AttendanceStatus;
import com.university.attendance.service.AttendanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    private final AttendanceService attendanceService;
    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @PostMapping("/mark")
    public ResponseEntity<?> mark(@RequestBody MarkRequest req) {
        LocalDate date = (req.date == null || req.date.isBlank()) ? LocalDate.now() : LocalDate.parse(req.date);
        AttendanceStatus status;
        try {
            status = AttendanceStatus.valueOf(req.status.toUpperCase());
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid status. Use PRESENT/ABSENT/LATE/EXCUSED");
        }
        AttendanceRecord rec = attendanceService.mark(req.studentId, req.courseId, date, status);
        if (rec == null) return ResponseEntity.status(404).body("Student or Course not found");
        return ResponseEntity.status(201).body(rec);
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<List<AttendanceRecord>> byStudent(@PathVariable String studentId) {
        return ResponseEntity.ok(attendanceService.getByStudent(studentId));
    }

    @GetMapping("/course/{courseId}")
    public ResponseEntity<List<AttendanceRecord>> byCourse(@PathVariable String courseId) {
        return ResponseEntity.ok(attendanceService.getByCourse(courseId));
    }

    @GetMapping("/course/{courseId}/date/{date}")
    public ResponseEntity<List<AttendanceRecord>> byCourseDate(@PathVariable String courseId, @PathVariable String date) {
        LocalDate d = LocalDate.parse(date);
        return ResponseEntity.ok(attendanceService.getByCourseAndDate(courseId, d));
    }

    public static class MarkRequest {
        public String studentId;
        public String courseId;
        public String date;   
        public String status; 
    }
}
