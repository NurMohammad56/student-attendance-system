package com.university.attendance.service;

import com.university.attendance.model.Course;
import com.university.attendance.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course create(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course getById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

@Override
public Course delete(String id) {
    Course course = courseRepository.findById(id).orElse(null);
    if (course != null) {
        courseRepository.deleteById(id);
    }
    return course; 
}

}
