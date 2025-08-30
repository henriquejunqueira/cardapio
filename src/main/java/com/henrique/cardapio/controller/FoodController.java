package com.henrique.cardapio.controller;

import com.henrique.cardapio.food.Food;
import com.henrique.cardapio.food.IFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Indicates to spring that this class is a controller
@RequestMapping("food") // Indicates to spring the endpoint of this controller
public class FoodController {

    @Autowired // Indicates to Spring that it will manage the processes of the FoodController classgit add .
    private IFoodRepository repository;

    @GetMapping // Endpoint of this method
    public void getAll(){ // Method to return all foods registered in the database
        List<Food> foodList = repository; // Creates a list that will be used to query food by id
    }
}
