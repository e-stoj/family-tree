package com.example.tree.services.implementation;

import com.example.tree.model.Person;
import com.example.tree.model.Tree;
import com.example.tree.repositories.PersonRepository;
import com.example.tree.repositories.TreeRepository;
import com.example.tree.services.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    TreeRepository treeRepository;

    @Autowired
    PersonRepository personRepository;

    @Override
    public Tree createTree(Tree tree) {
        treeRepository.save(tree);
        return tree;
    }

    @Override
    public Tree getTreeById(Long id) {
        return treeRepository.findById(id).orElseThrow(() -> new RuntimeException("Tree doesn't exist"));
    }

    @Override
    public Person selectMainPerson(Long treeId, Long personId) {
        Tree tree = treeRepository.findById(treeId).orElseThrow(() -> new RuntimeException("Tree doesn't exist"));
        Person person = personRepository.findById(personId).orElseThrow(() -> new RuntimeException("Person doesn't exist"));
        tree.setMainPerson(person);
        treeRepository.save(tree);
        return person;
    }

    @Override
    public Tree renameTree(Long treeId, String newName) {
        Tree tree = treeRepository.findById(treeId).orElseThrow(() -> new RuntimeException("Tree doesn't exist"));
        tree.setTreeName(newName);
        treeRepository.save(tree);
        return tree;
    }

    @Override
    public boolean deleteTree(Long id) {
        treeRepository.deleteById(id);
        return true;
    }
}
