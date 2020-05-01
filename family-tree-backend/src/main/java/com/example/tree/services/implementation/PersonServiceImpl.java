package com.example.tree.services.implementation;

import com.example.tree.model.Person;
import com.example.tree.repositories.PersonRepository;
import com.example.tree.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person addMother(Integer personId, Person mother) {
        Person person = personRepository.findById(personId).orElseThrow(() -> new RuntimeException("User doesn't exist"));
        createPerson(mother);
        person.setMother(mother);
        List<Person> children = mother.getChildren();
        children.add(person);
        mother.setChildren(children);
        personRepository.save(person);
        personRepository.save(mother);
        return person;
    }

    @Override
    public Person addFather(Integer personId, Integer fatherId) {
        Person person = personRepository.findById(personId).orElseThrow(() -> new RuntimeException("User doesn't exist"));
        Person father = personRepository.findById(fatherId).orElseThrow(() -> new RuntimeException("User doesn't exist"));
        person.setFather(father);
        List<Person> children = father.getChildren();
        children.add(person);
        father.setChildren(children);
        personRepository.save(person);
        personRepository.save(father);
        return person;
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
