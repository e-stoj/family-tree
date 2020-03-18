package com.example.tree.repositories;

import com.example.tree.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUserName(String userName);
}
