package com.example.tree.model;

import com.example.tree.model.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String familySurname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private boolean isAlive;
    @JsonIgnore
    @ManyToOne
    private Person mother;
    @JsonIgnore
    @ManyToOne
    private Person father;
    @JsonIgnore
    @OneToMany
    private List<Person> children;
    @JsonIgnore
    @OneToMany
    private List<Person> siblngs;
    @JsonIgnore
    @OneToOne
    private Person spouse;

    public Person(Integer id, String name, String surname, String familySurname, Gender gender, LocalDate birthDate, LocalDate deathDate, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.familySurname = familySurname;
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
