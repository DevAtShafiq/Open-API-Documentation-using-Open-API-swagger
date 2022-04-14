package com.example.productopenapi.controller;
import com.example.productopenapi.entity.Product;
import com.example.productopenapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public void addNewProduct(@RequestBody Product product) {

        productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public void addNewProducts(@RequestBody List<Product> products) {
        productService.saveProducts(products);

    }

    @GetMapping("/products")
    public List<Product> allProducts()
    {
        return productService.getAllProduct();
    }

    @GetMapping("/productById/{id}")
    public Product getProductById(@PathVariable Long id)
    {
        return  productService.getProductById(id);
    }


    @PutMapping("/update")
    public Product updateProduct(@PathVariable Long id , @RequestBody Product product)
    {
        Product existingProduct = productService.getProductById(id);
        existingProduct.setId(id);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        return  productService.updateProduct(existingProduct);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteProduct(@PathVariable Long id)
    {
        productService.deleteProductById(id);
    }

}
