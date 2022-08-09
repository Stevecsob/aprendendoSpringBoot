package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student maria = new Student( "Maria", "maria@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 6) );
            Student jose = new Student("José", "jose@gmail.com",
                    LocalDate.of(1999, Month.MARCH, 8) );

            repository.saveAll(
                    List.of(maria, jose)
            );
        };
    }

}
