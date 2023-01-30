package com.java.Attornatus.test.Model;

import jakarta.persistence.*;


@Embeddable
public class Address {

    @Column(name = "street")
    private String street;

    @Column(name = "zipCode")
    private int zipCode;

    @Column(name = "number")
    private int number;

    @Column(name = "city")
    private String city;

    @Column(name = "main")
    private boolean main;

    public Address(String street, int zipCode, int number, String city, boolean main) {
        this.street = street;
        this.zipCode = zipCode;
        this.number = number;
        this.city = city;
        this.main = main;
    }

    public Address() {
    }
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }


}



