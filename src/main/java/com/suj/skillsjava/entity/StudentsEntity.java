package com.suj.skillsjava.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class StudentsEntity {
    @Id
    private int ID;
    private String firstName;
    private String lastName;
    private String city;
    private String country;
}
