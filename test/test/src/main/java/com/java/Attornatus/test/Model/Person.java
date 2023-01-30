package com.java.Attornatus.test.Model;


import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;


    @Entity
    @DynamicUpdate
    public class Person {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "personName")
        private String personName;

        @Column(name = "birthDate")
        private String birthDate;

        public Person(Long id, String personName, String dataNascimento, Address address) {
            this.id = id;
            this.personName = personName;
            this.birthDate = birthDate;
            this.address = address;
        }

        public Person() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getPersonName() {
            return personName;
        }

        public void setPersonName(String personName) {
            this.personName = personName;
        }

        public String getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Embedded
        private Address address;

    }




