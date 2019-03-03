package com.suj.skillsjava.beans;


public class StudentBeans {
    private int ID;
    private String firstName;
    private String lastName;
    private String city;
    private String country;

    public StudentBeans(int ID, String firstName, String lastName, String city, String country) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.country = country;
    }

    public StudentBeans() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
