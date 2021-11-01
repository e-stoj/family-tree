package com.example.tree.services.implementation;

import com.example.tree.model.Person;
import com.example.tree.repositories.PersonRepository;
import com.example.tree.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person addMother(Long personId, Person mother) {
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
    public Person addFather(Long personId, Person father) {
        Person person = personRepository.findById(personId).orElseThrow(() -> new RuntimeException("User doesn't exist"));
        person.setFather(father);
        List<Person> children = father.getChildren();
        children.add(person);
        father.setChildren(children);
        personRepository.save(person);
        personRepository.save(father);
        return person;
    }

    @Override
    public Person addChild(Long personId, Person child) {
        return null;
    }

    @Override
    public Person addSibling(Long personId, Person sibling) {
        return null;
    }

    @Override
    public Person addSpouse(Long personId, Person spouse) {
        return null;
    }

    @Override
    public Person setPersonDeathDate(Long personId, LocalDate date) {
        return null;
    }

    @Override
    public Person changeSurname(Long personId, String newSurname) {
        return null;
    }

    @Override
    public Person editPerson(Long oldPersonId, Person newPerson) {
        return null;
    }

    @Override
    public boolean deletePerson(Long id) {
        return false;
    }

    @Override
    public Person getPerson(Long id) {
        return null;
    }

    @Override
    public Person getMother(Long personId) {
        return null;
    }

    @Override
    public Person getFather(Long personId) {
        return null;
    }

    @Override
    public List<Person> getChildren(Long personId) {
        return null;
    }

    @Override
    public List<Person> getSiblings(Long personId) {
        return null;
    }

    @Override
    public Person getSpouse(Long personId) {
        return null;
    }
}
