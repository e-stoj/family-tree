package com.example.tree.services;

import com.example.tree.model.Person;

import java.util.*;
import java.time.LocalDate;

public interface PersonService {

    Person createPerson(Person person);

    Person addMother(Integer personId, Person mother);

    Person addFather(Integer personId, Integer fatherId);

    Person addChild(Integer personId, Integer childId);

    Person addSibling(Integer personId, Integer siblingId);

    Person addSpouse(Integer personId, Integer spouseId);

    Person setPersonDeathDate(Integer personId, LocalDate date);

    Person changeSurname(Integer personId, String newSurname);

    Person editPerson(Integer oldPersonId, Person newPerson);

    boolean deletePerson(Integer id);

    Person getPerson(Integer id);

    Person getMother(Integer personId);

    Person getFather(Integer personId);

    List<Person> getChildren(Integer personId);

    List<Person> getSiblings(Integer personId);

    Person getSpouse(Integer personId);

}
