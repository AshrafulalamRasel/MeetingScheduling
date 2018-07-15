package com.doctorappointmant.DoctorAppontment.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class User {

    @Id
    private int id;
    private String username;
    private String address;
    private int age;
    private String mobleNumber;
    private String password;

    public User() {

    }



    public User(String username, String address,int age, String mobleNumber,  String password) {
        super();

        this.username = username;
        this.address = address;
        this.age = age;
        this.mobleNumber = mobleNumber;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobleNumber() {
        return mobleNumber;
    }

    public void setMobleNumber(String mobleNumber) {
        this.mobleNumber = mobleNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}