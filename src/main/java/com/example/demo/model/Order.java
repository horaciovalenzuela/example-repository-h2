package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id @GeneratedValue
    private Long id;

    private String description;

    private List<Product> products;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;

    public Order(){

    }
    public Order(String aDescription, User anUser){
        this.description = aDescription;
        this.user = anUser;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
