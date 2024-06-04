package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> searchUserById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/")
    public User create(@RequestBody Map<String, Object> requestBody) {
        String name = requestBody.get("name").toString();
        String surname = requestBody.get("surname").toString();
        User user = new User(name, surname);
        return userService.createUser(user);
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }

}
