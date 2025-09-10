package com.university.attendance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "attendance_records")
public class AttendanceRecord {
    @Id
    private String id;
    private String studentId;   
    private String courseId;    
    private LocalDate date;
    private AttendanceStatus status;

    public AttendanceRecord() {}

    public AttendanceRecord(String studentId, String courseId, LocalDate date, AttendanceStatus status) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
        this.status = status;
    }

    // getters & setters
    public String getId() { return id; }
    public String getStudentId() { return studentId; }
    public String getCourseId() { return courseId; }
    public LocalDate getDate() { return date; }
    public AttendanceStatus getStatus() { return status; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setStatus(AttendanceStatus status) { this.status = status; }
}