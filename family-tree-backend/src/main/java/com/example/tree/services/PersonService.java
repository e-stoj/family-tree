package com.example.tree.services;

import com.example.tree.model.Person;

import java.util.*;
import java.time.LocalDate;

public interface PersonService {

    Person createPerson(Person person);

    Person addMother(Long personId, Person mother);

    Person addFather(Long personId, Person father);

    Person addChild(Long personId, Person child);

    Person addSibling(Long personId, Person sibling);

    Person addSpouse(Long personId, Person spouse);

    Person setPersonDeathDate(Long personId, LocalDate date);

    Person changeSurname(Long personId, String newSurname);

    Person editPerson(Long oldPersonId, Person newPerson);

    boolean deletePerson(Long id);

    Person getPerson(Long id);

    Person getMother(Long personId);

    Person getFather(Long personId);

    List<Person> getChildren(Long personId);

    List<Person> getSiblings(Long personId);

    Person getSpouse(Long personId);

}
