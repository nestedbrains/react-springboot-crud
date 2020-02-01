package com.sio.reactspringserver.controller;

import com.sio.reactspringserver.domain.Student;
import com.sio.reactspringserver.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;

@RestController
@RequestMapping("/v1/api")
@CrossOrigin(origins = "http://localhost:3000")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public Collection<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @PostMapping("/students")
    public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student) {
        Student result = studentRepository.save(student);
        return ResponseEntity.ok().body(result);
    }
}
