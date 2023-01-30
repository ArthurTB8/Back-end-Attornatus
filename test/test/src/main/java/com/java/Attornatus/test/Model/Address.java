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

    @Column(name = "principal")
    private boolean principal;

    public Address(String street, int zipCode, int number, String city, boolean principal) {
        this.street = street;
        this.zipCode = zipCode;
        this.number = number;
        this.city = city;
        this.principal = principal;
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

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }


}



