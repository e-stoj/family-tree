package com.example.tree.services;

import com.example.tree.model.Person;
import com.example.tree.model.Tree;

public interface TreeService {

    Tree createTree(Tree tree);

    Tree getTreeById(Long id);

    Person selectMainPerson(Long treeId, Long personId);

    Tree renameTree(Long treeId, String newName);

    boolean deleteTree(Long id);
}
