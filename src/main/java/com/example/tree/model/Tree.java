package com.example.tree.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
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
}
