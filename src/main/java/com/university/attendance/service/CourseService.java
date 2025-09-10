package com.university.attendance.service;

import com.university.attendance.model.Course;
import java.util.List;

public interface CourseService {
    Course create(Course c);
    List<Course> getAll();
    Course getById(String id);
    Course delete(String id);
}
