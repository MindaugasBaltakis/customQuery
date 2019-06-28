package com.uzdavinukas.testas.services;

import com.uzdavinukas.testas.entities.InvLine;
import com.uzdavinukas.testas.entities.Product;
import com.uzdavinukas.testas.repositories.InventoryRepository;
import com.uzdavinukas.testas.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;
    private InventoryRepository inventoryRepository;

    public ProductService(ProductRepository productRepository, InventoryRepository inventoryRepository) {
        this.productRepository = productRepository;
        this.inventoryRepository = inventoryRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<InvLine> getAllInventory(){
        return inventoryRepository.getAllProductQuantity();
    }

    public List<InvLine> getAllInventory(Integer limit, Integer offset){
        return inventoryRepository.getAllProductQuantity(limit, offset);
    }
}
