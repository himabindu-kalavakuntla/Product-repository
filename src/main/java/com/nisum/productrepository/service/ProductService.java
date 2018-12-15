package com.nisum.productrepository.service;

import com.nisum.productrepository.model.Product;
import com.nisum.productrepository.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public String createProducts(Product product) {
        productRepository.save(product);
        return "Product is Created";
    }
}
