// package com.university.attendance.service;

// import com.university.attendance.model.AttendanceRecord;
// import com.university.attendance.model.AttendanceStatus;
// import com.university.attendance.model.Student;
// import com.university.attendance.model.Course;
// import com.university.attendance.repository.AttendanceRepository;
// import com.university.attendance.repository.StudentRepository;
// import com.university.attendance.repository.CourseRepository;
// import org.springframework.stereotype.Service;
// import java.time.LocalDate;
// import java.util.List;
// import java.util.Optional;

// @Service
// public class AttendanceServiceImpl implements AttendanceService {
//     private final AttendanceRepository attendanceRepository;
//     private final StudentRepository studentRepository;
//     private final CourseRepository courseRepository;

//     public AttendanceServiceImpl(AttendanceRepository attendanceRepository,
//                                  StudentRepository studentRepository,
//                                  CourseRepository courseRepository) {
//         this.attendanceRepository = attendanceRepository;
//         this.studentRepository = studentRepository;
//         this.courseRepository = courseRepository;
//     }

//     @Override
//     public AttendanceRecord mark(String studentId, String courseId, LocalDate date, AttendanceStatus status) {
//         // basic existence check; if not exist return null
//         Optional<Student> st = studentRepository.findById(studentId);
//         Optional<Course> cr = courseRepository.findById(courseId);
//         if (st.isEmpty() || cr.isEmpty()) return null;

//         AttendanceRecord rec = new AttendanceRecord(studentId, courseId, date, status);
//         return attendanceRepository.save(rec);
//     }

//     @Override
//     public List<AttendanceRecord> getByStudent(String studentId) {
//         return attendanceRepository.findByStudentId(studentId);
//     }

//     @Override
//     public List<AttendanceRecord> getByCourseAndDate(String courseId, LocalDate date) {
//         return attendanceRepository.findByCourseIdAndDate(courseId, date);
//     }

//     @Override
//     public List<AttendanceRecord> getByCourse(String courseId) {
//         return attendanceRepository.findByCourseId(courseId);
//     }
// }
