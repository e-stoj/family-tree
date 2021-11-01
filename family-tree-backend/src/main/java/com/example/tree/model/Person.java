package com.example.tree.model;

import com.example.tree.model.enums.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.*;
import java.time.LocalDate;

@Entity
public class Person extends AbstractEntity {

    @Id
    Long id;

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
    private List<Person> siblings;
    @JsonIgnore
    @OneToOne
    private Person spouse;

    public Person(String name, String surname, String familySurname, Gender gender, LocalDate birthDate, LocalDate deathDate, boolean isAlive) {
        this.name = name;
        this.surname = surname;
        this.familySurname = familySurname;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.isAlive = isAlive;
        this.children = new LinkedList<>();
        this.siblings = new LinkedList<>();
    }

    public Person() {
        this.children = new LinkedList<>();
        this.siblings = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFamilySurname() {
        return familySurname;
    }

    public void setFamilySurname(String familySurname) {
        this.familySurname = familySurname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
