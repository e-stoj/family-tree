package com.example.tree.services;

import com.example.tree.model.Person;
import com.example.tree.model.Tree;

public interface TreeService {

    Tree createTree(Tree tree);

    Tree getTreeById(Integer id);

    Person selectMainPerson(Integer treeId, Integer personId);

    Tree renameTree(Integer treeId, String newName);

    boolean deleteTree(Integer id);
}
