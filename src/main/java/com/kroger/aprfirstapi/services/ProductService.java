package com.kroger.aprfirstapi.services;

import com.kroger.aprfirstapi.models.Product;
import org.springframework.objenesis.SpringObjenesis;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);

    public List<Product> getAllProducts();
}
