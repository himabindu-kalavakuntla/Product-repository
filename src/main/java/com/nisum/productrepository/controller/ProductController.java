package com.nisum.productrepository.controller;

import com.nisum.productrepository.model.Product;
import com.nisum.productrepository.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/create-product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<String> createProducts(@RequestBody Product product) {
        if(product.getProductId() == null) {
            product.setProductId(UUID.randomUUID().toString());
        }
        return new ResponseEntity<String>(productService.createProducts(product), HttpStatus.CREATED);
    }
}
