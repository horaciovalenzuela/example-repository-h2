package com.example.demo.controller.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("El usuario con ID: " + id + " no fue encontrado");
    }
}
