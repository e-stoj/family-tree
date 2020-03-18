package com.example.tree.services;

import com.example.tree.model.Tree;
import com.example.tree.model.User;

import java.util.*;

public interface UserService {

    User createUser(User user);

    User getUserById(Integer id);

    User login(String username, String password);

    List<Tree> getUserTreesList(Integer id);

    boolean deleteUser(Integer id);


}
