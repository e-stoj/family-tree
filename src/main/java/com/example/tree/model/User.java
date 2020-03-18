package com.example.tree.model;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class User {

    private Integer id;
    private String userName;
    private String password;
    private List<Tree> trees;

    public User(Integer id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.trees = new LinkedList<>();
    }

    public User() {
        this.trees = new LinkedList<>();
    }
}
