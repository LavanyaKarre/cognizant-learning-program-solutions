package com.example.jpacomparison.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
    public static void run() {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Employee emp = new Employee("Hibernate User");
        session.save(emp);

        session.getTransaction().commit();
        session.close();
        factory.close();
    }

    @jakarta.persistence.Entity
    @jakarta.persistence.Table(name = "hib_employees")
    public static class Employee {
        @jakarta.persistence.Id
        @jakarta.persistence.GeneratedValue
        private Long id;
        private String name;

        public Employee() {}
        public Employee(String name) { this.name = name; }

        // getters and setters (optional)
    }
}
