package com.henrique.cardapio.controller;

import com.henrique.cardapio.food.Food;
import com.henrique.cardapio.food.FoodRequestDTO;
import com.henrique.cardapio.food.FoodResponseDTO;
import com.henrique.cardapio.food.IFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController // Indicates to spring that this class is a controller
@RequestMapping("food") // Indicates to spring the endpoint of this controller
public class FoodController {

    @Autowired // Indicates to Spring that it will manage the processes of the FoodController class
    private IFoodRepository repository;

    // @CrossOrigin(origins = "*", allowedHeaders = "*") // Allows requests from any origin with any headers (CORS configuration).
    @CrossOrigin(origins = "http://localhost:5173", allowedHeaders = "*",
            methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
    @PostMapping()
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data); // Transforms the FoodRequestDTO into the entity
        repository.save(foodData);
        return;
    }

    @GetMapping // Endpoint of this method
    public List<FoodResponseDTO> getAll(){ // Method to return all foods registered in the database
        // Creates a list that will be used to query food by id
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).collect(Collectors.toList());
        return foodList;
    }
}
