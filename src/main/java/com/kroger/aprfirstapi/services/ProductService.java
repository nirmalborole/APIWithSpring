package com.kroger.aprfirstapi.services;

import com.kroger.aprfirstapi.models.Product;
import org.springframework.objenesis.SpringObjenesis;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);

    public List<Product> getAllProducts();
    public Product createProuct(String title, String description,String image,double price, String categoryName);
    public boolean deleteProuct();
    public Product updatePrice(long productId, double updatedprice);
    public Product updateImage(long productId, String updateImage);


}
