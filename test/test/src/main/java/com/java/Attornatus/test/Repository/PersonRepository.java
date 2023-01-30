package com.java.Attornatus.test.Repository;


import com.java.Attornatus.test.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    }

