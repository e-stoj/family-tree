package com.example.tree.services;

import com.example.tree.model.Tree;
import com.example.tree.model.User;

import java.util.*;

public interface UserService {

    User register(User user);

    User getUserById(Long id);

    User login(String username, String password);

    List<Tree> getUserTreesList(Long id);

    boolean deleteUser(Long id);


}
