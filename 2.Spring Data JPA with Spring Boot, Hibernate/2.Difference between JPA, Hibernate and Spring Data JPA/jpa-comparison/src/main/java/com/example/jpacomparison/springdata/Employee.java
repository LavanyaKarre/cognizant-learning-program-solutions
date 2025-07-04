package com.example.jpacomparison.springdata;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Employee() {}
    public Employee(String name) { this.name = name; }

    // getters and setters (optional)
}
