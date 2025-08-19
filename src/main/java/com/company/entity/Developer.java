package com.company.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString

public class Developer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private  String fName;
    private String lName;
    private String city;
    private int age;
    private String gender;
    private String salary;
    private String developerId;
    private int yearOfBirth;


}

