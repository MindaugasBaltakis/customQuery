package com.uzdavinukas.testas.repositories;

import com.uzdavinukas.testas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
