package com.example.tree.controllers;

import com.example.tree.model.Person;
import com.example.tree.model.Tree;
import com.example.tree.services.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TreeController {

    @Autowired
    private TreeService treeService;

    @PutMapping("/trees/add")
    public Tree createTree(Tree tree) {
        return treeService.createTree(tree);
    }

    @PostMapping("/trees/{treeId}/main-person/{personId}")
    public Person selectMainPerson(@PathVariable Long treeId, @PathVariable Long personId) {
        return treeService.selectMainPerson(treeId, personId);
    }

    @PostMapping("/trees/{id}/rename")
    public Tree renameTree(@PathVariable Long id, @RequestBody String newName) {
        return treeService.renameTree(id, newName);
    }

    @DeleteMapping("trees/{id}")
    boolean deleteTree(Long id) {
        return treeService.deleteTree(id);
    }
}
