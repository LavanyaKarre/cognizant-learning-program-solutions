package com.example.jpacomparison.jpa;

import jakarta.persistence.*;

public class JPAExample {

    public static void run() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Person person = new Person("JPA User");
        em.persist(person);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

    @Entity
    @Table(name = "persons")
    public static class Person {
        @Id
        @GeneratedValue
        private Long id;
        private String name;

        public Person() {}
        public Person(String name) { this.name = name; }

        // getters and setters (optional)
    }
}
