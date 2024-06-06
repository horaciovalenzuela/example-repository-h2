package com.example.demo.model;

public class Product {

    private Long id;
    private Double price;
    private String description;

    public Product(){

    }

    public Product(Double aPrice, String aDescription){
        this.price = aPrice;
        this.description = aDescription;
    }
}

