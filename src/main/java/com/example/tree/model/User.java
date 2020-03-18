package com.example.tree.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String password;
    @OneToMany
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
