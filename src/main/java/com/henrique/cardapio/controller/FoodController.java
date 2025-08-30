package com.henrique.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indicates to spring that this class is a controller
@RequestMapping("food") // Indicates to spring the endpoint of this controller
public class FoodController {

    @GetMapping // Endpoint of this method
    public void getAll(){ // Method to return all foods registered in the database

    }
}
