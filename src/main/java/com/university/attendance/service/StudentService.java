package com.university.attendance.service;

import com.university.attendance.model.Student;
import java.util.List;

public interface StudentService {
    Student create(Student s);
    List<Student> getAll();
    Student getById(String id);
    void delete(String id);
}