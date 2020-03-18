package com.example.tree.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;


@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String password;
    @JsonIgnore
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Tree> getTrees() {
        return trees;
    }

    public void setTrees(List<Tree> trees) {
        this.trees = trees;
    }
}
