package com.example.exampledemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class PersonEntity {
    @Id
    @SequenceGenerator(
        name = "person_sequence",
        sequenceName = "person_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "person_sequence"
    )



    private long id;
    private String name;
    private String role;  
    public PersonEntity(long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setRole(String role) {
        this.role = role;
    }


}
