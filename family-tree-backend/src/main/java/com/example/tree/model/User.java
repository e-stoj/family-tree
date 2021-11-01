package com.example.tree.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*;


@Entity
public class User extends AbstractEntity {

    @Id
    Long id;

    private String userName;
    private String password;
    @JsonIgnore
    @OneToMany
    private List<Tree> trees;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.trees = new LinkedList<>();
    }

    public User() {
        this.trees = new LinkedList<>();
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
