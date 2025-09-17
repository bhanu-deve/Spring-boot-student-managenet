package com.bhanutech.student_service.Controller;

import com.bhanutech.student_service.Dto.StudentRequestDto;
import com.bhanutech.student_service.Entity.Student;
import com.bhanutech.student_service.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // CREATE - POST /students/create
    @PostMapping("/create")
    public Student createStudent(@RequestBody StudentRequestDto dto) {
        return studentService.createStudent(dto);
    }

    // READ ALL - GET /students/all
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // READ BY ID - GET /students/{studentId}
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        return studentService.getStudentById(studentId);
    }

    // UPDATE - PUT /students/{studentId}
    @PutMapping("/{studentId}")
    public Student updateStudent(@RequestBody StudentRequestDto dto,
                                 @PathVariable int studentId) {
        return studentService.updateStudent(dto, studentId);
    }

    // DELETE - DELETE /students/{studentId}
    @DeleteMapping("/{studentId}")
    public String deleteStudentById(@PathVariable int studentId) {
        return studentService.deleteStudentById(studentId);
    }
}
