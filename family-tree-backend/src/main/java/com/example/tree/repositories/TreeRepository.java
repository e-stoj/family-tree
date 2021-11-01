package com.example.tree.repositories;

import com.example.tree.model.Tree;
import org.springframework.data.repository.CrudRepository;

public interface TreeRepository extends CrudRepository<Tree, Long> {
}
