package com.example.tree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tree {

    @Id
    @GeneratedValue
    private Integer id;
    private String treeName;
    @ManyToOne
    private Person mainPerson;

    public Tree(Integer id, String treeName) {
        this.id = id;
        this.treeName = treeName;
    }

    public Tree() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public Person getMainPerson() {
        return mainPerson;
    }

    public void setMainPerson(Person mainPerson) {
        this.mainPerson = mainPerson;
    }
}
