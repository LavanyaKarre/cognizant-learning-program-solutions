package com.example.jpacomparison.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringDataExample implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repo;

    @Override
    public void run(String... args) {
        repo.save(new Employee("Spring Data JPA User"));
        System.out.println("Spring Data JPA inserted an employee!");
    }
}
