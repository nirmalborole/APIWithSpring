package com.kroger.aprfirstapi.services;

import com.kroger.aprfirstapi.models.Category;
import com.kroger.aprfirstapi.models.Product;
import com.kroger.aprfirstapi.repositories.Categoryrepositoy;
import com.kroger.aprfirstapi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

//@Primary
@Service("selfProduct")
public class SelfProductService implements ProductService{
    private ProductRepository productRepository;
    private CategoryService categoryService;
    @Autowired
    public SelfProductService(ProductRepository productRepository, CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;

    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProuct(String title, String description, String image, double price, String categoryName) {
        Category category= categoryService.createCategory(categoryName);
        Product product=new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setImage(image);
        product.setPrice(price);
        product.setCategory(category);
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProuct() {
        return false;
    }

    @Override
    public Product updatePrice(long productId, double updatedprice) {
        return null;
    }

    @Override
    public Product updateImage(long productId, String updateImage) {
        return null;
    }
}
