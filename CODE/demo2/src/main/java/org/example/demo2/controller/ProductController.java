package org.example.demo2.controller;

import org.example.demo2.model.Product;
import org.example.demo2.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/products")
    public Long create(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
