package com.example.tree.services.implementation;

import com.example.tree.model.Person;
import com.example.tree.services.PersonService;

import java.time.LocalDate;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Override
    public Person createPerson(Integer id) {
        return null;
    }

    @Override
    public Person addMother(Integer personId, Integer motherId) {
        return null;
    }

    @Override
    public Person addFather(Integer personId, Integer fatherId) {
        return null;
    }

    @Override
    public Person addChild(Integer personId, Integer childId) {
        return null;
    }

    @Override
    public Person addSibling(Integer personId, Integer siblingId) {
        return null;
    }

    @Override
    public Person addSpouse(Integer personId, Integer spouseId) {
        return null;
    }

    @Override
    public Person setPersonDeathDate(Integer personId, LocalDate date) {
        return null;
    }

    @Override
    public Person changeSurname(Integer personId, String newSurname) {
        return null;
    }

    @Override
    public Person editPerson(Integer oldPersonId, Person newPerson) {
        return null;
    }

    @Override
    public boolean deletePerson(Integer id) {
        return false;
    }

    @Override
    public Person getPerson(Integer id) {
        return null;
    }

    @Override
    public Person getMother(Integer personId) {
        return null;
    }

    @Override
    public Person getFather(Integer personId) {
        return null;
    }

    @Override
    public List<Person> getChildren(Integer personId) {
        return null;
    }

    @Override
    public List<Person> getSiblings(Integer personId) {
        return null;
    }

    @Override
    public Person getSpouse(Integer personId) {
        return null;
    }
}
