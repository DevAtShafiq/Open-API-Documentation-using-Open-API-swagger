package com.example.productopenapi.service;

import com.example.productopenapi.entity.Product;
import com.example.productopenapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    //add
    //getAll
    //getById
    //update
    //delete


    public void saveProduct(Product product) {

        productRepository.save(product);
    }

    public void saveProducts(List<Product> products) {

        productRepository.saveAll(products);
    }

    public List<Product> getAllProduct() {

        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();

    }

    public Product updateProduct(Product product) {

        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

}
