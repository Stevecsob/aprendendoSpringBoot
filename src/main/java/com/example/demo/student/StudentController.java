package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(1L, "Maria", "maria@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 6), 21 )
        );
    }
}