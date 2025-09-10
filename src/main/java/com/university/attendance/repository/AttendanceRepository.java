package com.university.attendance.repository;

import com.university.attendance.model.AttendanceRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDate;
import java.util.List;

public interface AttendanceRepository extends MongoRepository<AttendanceRecord, String> {
    List<AttendanceRecord> findByStudentId(String studentId);
    List<AttendanceRecord> findByCourseIdAndDate(String courseId, LocalDate date);
    List<AttendanceRecord> findByCourseId(String courseId);
}
