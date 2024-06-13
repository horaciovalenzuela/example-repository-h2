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

    public UserController(){

    }


    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public Optional<User> searchUserById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/")
    public User create(@RequestBody Map<String, Object> requestBody) {
        String name = requestBody.get("name").toString();
        String surname = requestBody.get("surname").toString();
        int age = (int) requestBody.get("age");
        User user = new User(name, surname, age);
        return userService.createUser(user);
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/userbetween")
    public List<User> findAllWithAgeBetween(int x, int y){
        return userService.findAllWithAgeBetween(x, y);
    }

}
