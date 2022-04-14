package com.example.productopenapi;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "products API",version="2.6.6",description = "Product microservice"))
public class ProductOpenApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductOpenApiApplication.class, args);
    }

}
