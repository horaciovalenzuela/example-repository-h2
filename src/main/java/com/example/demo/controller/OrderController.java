package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.service.OrderService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<Order> searchUserById(@PathVariable Long id){
        return orderService.findById(id);
    }

    @PostMapping("/")
    public Order create(@RequestBody Map<String, Object> requestBody) {
        String description = requestBody.get("description").toString();
        Long id = (Long) requestBody.get("idUser");
        return orderService.createAndAddOrder(description, id);
    }

}
