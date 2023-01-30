package com.java.Attornatus.test.Controller;

import com.java.Attornatus.test.Model.Person;
import com.java.Attornatus.test.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;




@RestController
public class PersonController {

        @Autowired
        private PersonService personService;

        @GetMapping
        @RequestMapping("/people")
        public ResponseEntity<List<Person>> searchPeople() {
            return ResponseEntity.ok(personService.searchPeople());
        }

        @GetMapping("/people/{id}")
        public ResponseEntity<?> searchPersonId(@PathVariable Long id) {

            Optional<Person> person = PersonService.searchPersonId(id);

            if (person.isPresent()) {
                return ResponseEntity.ok(person.get());
            }
            return ResponseEntity.ok().body("Id não encontrado");

        }

        @PostMapping
        @RequestMapping("/person")
        public ResponseEntity<Person> addPerson(@RequestBody Person person) {
            return ResponseEntity.ok(PersonService.insertPerson(person));

        }

        @PutMapping("/changeperson/{id}")
        public ResponseEntity<Person> changePerson(@RequestBody Person person) {
            return ResponseEntity.ok(PersonService.changePerson(person));
        }

    }


