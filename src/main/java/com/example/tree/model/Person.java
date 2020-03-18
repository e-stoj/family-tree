package com.example.tree.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private boolean isAlive;
    @ManyToOne
    private Person mother;
    @ManyToOne
    private Person father;
    @OneToMany
    private List<Person> children;
    @OneToMany
    private List<Person> siblngs;
    @OneToOne
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
