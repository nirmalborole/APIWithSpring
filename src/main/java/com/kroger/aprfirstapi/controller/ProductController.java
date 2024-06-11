package com.kroger.aprfirstapi.controller;

import com.kroger.aprfirstapi.dtos.CreateProductRequestDto;
import com.kroger.aprfirstapi.models.Product;
import com.kroger.aprfirstapi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(@Qualifier("selfProduct") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") long id){

        return productService.getProductById(id);
    }
    public List<Product> getProducts(){
        return new ArrayList<Product>();
    }

    @PostMapping("")
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto){
        return productService.createProuct(requestDto.getTitle(),requestDto.getDescription(),requestDto.getImage(),requestDto.getPrice(),requestDto.getCategoryname());
    }
}
