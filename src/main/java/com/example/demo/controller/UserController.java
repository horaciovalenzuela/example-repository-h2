package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/")
    public List<User> findAll(){
        return userService.findAll();
    }


    @GetMapping("/users/{id}")
    public Optional<User> searchUserById(@PathVariable Long id){
        return userService.findById(id);
    }




}
