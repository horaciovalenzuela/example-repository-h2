package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Product {

    @Id @GeneratedValue
    private Long id;
    private Double price;
    private String description;

    public Product(){

    }

    public Product(Double aPrice, String aDescription){
        this.price = aPrice;
        this.description = aDescription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

