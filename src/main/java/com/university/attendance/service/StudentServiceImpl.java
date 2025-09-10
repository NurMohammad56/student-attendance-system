// package com.university.attendance.service;

// import com.university.attendance.model.Student;
// import com.university.attendance.repository.StudentRepository;
// import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;

// @Service
// public class StudentServiceImpl implements StudentService {
//     private final StudentRepository studentRepository;

//     public StudentServiceImpl(StudentRepository studentRepository) {
//         this.studentRepository = studentRepository;
//     }

//     @Override
//     public Student create(Student s) {
//         return studentRepository.save(s);
//     }

//     @Override
//     public List<Student> getAll() {
//         return studentRepository.findAll();
//     }

//     @Override
//     public Student getById(String id) {
//         Optional<Student> opt = studentRepository.findById(id);
//         return opt.orElse(null); // simple: return null if not found
//     }

//     @Override
//     public void delete(String id) {
//         studentRepository.deleteById(id);
//     }
// }