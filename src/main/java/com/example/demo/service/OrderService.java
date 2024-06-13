package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    public Order createAndAddOrder(String description, Long id) {
        User user = userRepository.findById(id).get();
        Order order = new Order(description, user);
        Order orderPerst = orderRepository.save(order);
        user.addOrder(orderPerst);
        userRepository.save(user);
        return orderPerst;
    }

    public Optional<Order> findById(Long id) {
        return orderRepository.findById(id);
    }
}
