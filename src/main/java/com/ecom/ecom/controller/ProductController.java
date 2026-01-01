package com.ecom.ecom.controller;

import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecom.model.Product;
import com.ecom.ecom.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @GetMapping("/products")
    public ResponseEntity<List<Product> >getProducts() {
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.ACCEPTED);
    }
    
}
