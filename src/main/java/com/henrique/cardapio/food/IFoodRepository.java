package com.henrique.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

// Creates the interface of the Food class that extends the JpaRepository,
// receives the Food class that will be managed by the interface and the
// type of the class id that is Long
public interface IFoodRepository extends JpaRepository <Food, Long>{
}
