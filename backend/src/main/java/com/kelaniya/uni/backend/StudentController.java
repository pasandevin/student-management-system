package com.kelaniya.uni.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

//    @GetMapping("/student/{id}")
//    public String getStudent(@PathVariable Integer id) {
//        return studentRepository.getById(id);
//    }

    @PostMapping("/student")
    public void addStudent(@RequestBody Student studentData) {
        studentRepository.save(studentData);
    }

}
