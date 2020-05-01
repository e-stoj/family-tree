package com.example.tree.services.implementation;

import com.example.tree.model.Tree;
import com.example.tree.model.User;
import com.example.tree.repositories.UserRepository;
import com.example.tree.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User register(User user) {
        if (user.getId() == null) {
            try {
                userRepository.save(user);
                return user;
            } catch (DataIntegrityViolationException e) {
                //empty intentionally
            }
        }
        return null;
    }

    @Override
    public User getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User doesn't exist"));
    }

    @Override
    public User login(String username, String password) {
        User user = userRepository.findByUserName(username).orElseThrow(() -> new RuntimeException("User doesn't exist"));
        if (user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    @Override
    public List<Tree> getUserTreesList(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User doesn't exist"));
        return user.getTrees();
    }

    @Override
    public boolean deleteUser(Integer id) {
        return false;
    }
}
