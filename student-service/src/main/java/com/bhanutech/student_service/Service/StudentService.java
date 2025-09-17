package com.bhanutech.student_service.Service;


import com.bhanutech.student_service.Dto.StudentRequestDto;
import com.bhanutech.student_service.Entity.Student;
import com.bhanutech.student_service.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // CREATE operation
    public Student createStudent(StudentRequestDto dto) {
        Student student = new Student();
        student.setStudentName(dto.getStudentName());
        student.setAddress(dto.getAddress());
        student.setMarks(dto.getMarks());
        return studentRepository.save(student);
    }

    // READ operations
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int studentId) {
        return studentRepository.findById(studentId).get();
    }

    // UPDATE operation
    public Student updateStudent(StudentRequestDto dto, int studentId) {
        Student student = studentRepository.findById(studentId).get();
        student.setStudentName(dto.getStudentName());
        student.setAddress(dto.getAddress());
        student.setMarks(dto.getMarks());
        return studentRepository.save(student);
    }

    // DELETE operation
    public String deleteStudentById(int studentId) {
        studentRepository.deleteById(studentId);
        return "Student deleted successfully";
    }
}

