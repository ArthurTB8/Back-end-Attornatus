package com.java.Attornatus.test.Service;


import com.java.Attornatus.test.Model.Person;
import com.java.Attornatus.test.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    static String msn = "Erro tente novamente";

    @Autowired
    private static PersonRepository ps;

    @GetMapping
    public List<Person> searchPeople() {
        try {
            return ps.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + msn);
        }
    }

    @GetMapping
    public static Optional<Person> searchPersonId(Long id) {
        try {
            return ps.findById(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + msn);
        }
    }

    @PostMapping
    public static Person insertPerson(Person person) {
        try {
            return ps.save(person);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + msn);
        }
    }

    @PutMapping
    public static Person changePerson(Person person) {
        try {
            return ps.save(person);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + msn);
        }
    }
}
