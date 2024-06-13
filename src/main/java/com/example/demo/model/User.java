package com.example.demo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id @GeneratedValue
    private Long id;
    private String name, surname;

    private int age;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Order> orders;

    public User(String unNombre, String unApellido, int edad){
        this.name = unNombre;
        this.surname = unApellido;
        this.age = edad;
        this.orders = new ArrayList<>();
    }

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String apellido) {
        this.surname = apellido;
    }

    public Order addOrder(Order anOrder){
        this.orders.add(anOrder);
        anOrder.setUser(this);
        return anOrder;
    }

    public int getEdad() {
        return age;
    }

    public void setEdad(int edad) {
        this.age = edad;
    }
}
