package com.newAPI.myown.domain;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetNumber;
    private String streetName;
    private String city;
    private String state;
    private String zip;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Address(Long id, String streetNumber, String streetName, String city, String state, String zip, Customer customer) {
        this.id = id;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}

