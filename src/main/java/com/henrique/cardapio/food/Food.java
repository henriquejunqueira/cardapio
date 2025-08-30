package com.henrique.cardapio.food;

import jakarta.persistence.*;

@Table(name = "foods") // Sets the name of the table in the database
@Entity(name = "foods") // Sets the name of the entity
public class Food {

    @Id // Defines the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Defines that there will be automatic generation of values
    private Long id;

    private String title;
    private String image;
    private Double price;

}
