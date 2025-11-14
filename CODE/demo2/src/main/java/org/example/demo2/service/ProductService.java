package org.example.demo2.service;


import org.example.demo2.model.Product;
import org.example.demo2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Long createProduct(Product product){
        productRepository.save(product);
        return product.getId();
    }
}
