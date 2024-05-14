package com.spring.demo.rest;


import com.spring.demo.util.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    private ArrayList<Student>  theStudents=new ArrayList<>();
    @PostConstruct
    public  void build(){
        theStudents.add(new Student("jay","ram"));
        theStudents.add(new Student("jai","sita"));
    }

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if((studentId> theStudents.size()) || studentId <0 ){
            throw new StudentNotFoundException("the student not fount with id "+studentId);
        }

        return  theStudents.get(studentId);
    }

    @GetMapping("/student")
    public List<Student> getStudents(){
        return theStudents;
    }


}
