package com.example.tree.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tree {

    private Integer id;
    private String treeName;
    private Person mainPerson;

    public Tree(Integer id, String treeName) {
        this.id = id;
        this.treeName = treeName;
    }

    public Tree() {
    }
}
