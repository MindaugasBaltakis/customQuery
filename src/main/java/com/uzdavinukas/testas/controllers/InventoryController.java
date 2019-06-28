package com.uzdavinukas.testas.controllers;

import com.uzdavinukas.testas.entities.InvLine;
import com.uzdavinukas.testas.entities.Product;
import com.uzdavinukas.testas.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class InventoryController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/inventory")
    public List<InvLine> getAllInventory() {
        return productService.getAllInventory();
    }

    @GetMapping("/inventory/page")
    public List<InvLine> getAllInventory(@RequestParam Integer limit, @RequestParam Integer offset) {
        return productService.getAllInventory(limit, offset);
    }
}

