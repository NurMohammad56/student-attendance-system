package com.university.attendance.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {
    @Id
    private String id;
    private String code; 
    private String title;

    public Course() {}

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    // getters & setters
    public String getId() { return id; }
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public void setCode(String code) { this.code = code; }
    public void setTitle(String title) { this.title = title; }
}
