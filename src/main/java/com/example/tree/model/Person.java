package com.example.tree.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.time.LocalDate;

@Getter
@Setter
public class Person {

    private Integer id;
    private String name;
    private String surname;
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private boolean isAlive;
    private Person mother;
    private Person father;
    private List<Person> children;
    private List<Person> siblngs;
    private Person spouse;

    public Person(Integer id, String name, String surname, Gender gender, LocalDate birthDate, LocalDate deathDate, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.isAlive = isAlive;
        this.children = new LinkedList<>();
        this.siblngs = new LinkedList<>();
    }

    public Person() {
        this.children = new LinkedList<>();
        this.siblngs = new LinkedList<>();
    }
}
