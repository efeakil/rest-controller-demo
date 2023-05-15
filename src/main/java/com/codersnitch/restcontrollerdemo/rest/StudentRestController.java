package com.codersnitch.restcontrollerdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codersnitch.restcontrollerdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    
    @GetMapping("/students")
    public List<Student> getStudents(){
        
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ava", "Smith"));
        students.add(new Student("Ben", "Jones"));
        students.add(new Student("Clara", "Brown"));
        

        return students;
    }
}
