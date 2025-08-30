package com.henrique.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods") // Sets the name of the table in the database
@Entity(name = "foods") // Sets the name of the entity
@Getter // Tells lombok to generate all get methods
@NoArgsConstructor // Tells lombok to generate a constructor that does not receive any arguments
@AllArgsConstructor // Tells lombok to generate a constructor that does not receive all arguments
@EqualsAndHashCode(of = "id") // Indicates to lombok that the id is a unique representation
public class Food {

    @Id // Defines the primary key of the table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Defines that there will be automatic generation of values
    private Long id;

    private String title;
    private String image;
    private Double price;

}
