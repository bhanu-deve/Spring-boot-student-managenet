package com.bhanutech.student_service.Repository;

import com.bhanutech.student_service.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
