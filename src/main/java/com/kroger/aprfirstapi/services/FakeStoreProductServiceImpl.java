package com.kroger.aprfirstapi.services;

import com.kroger.aprfirstapi.dtos.FakeProductServiceDtos;
import com.kroger.aprfirstapi.models.Category;
import com.kroger.aprfirstapi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Calendar;
import java.util.List;
@Service("fakeProduct")
public class FakeStoreProductServiceImpl implements ProductService{
    private RestTemplate restTemplate;
    @Autowired
    public FakeStoreProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertDtoToPoduct(FakeProductServiceDtos dto){
        Product product=new Product();
        product.setId(dto.getId());
        product.setDescription(dto.getDescription());
        product.setImage(dto.getImage());
        product.setPrice(dto.getPrice());
        Category category=new Category();
        category.setName(dto.getCategory());
//        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById(long id) {

        FakeProductServiceDtos product = this.restTemplate.getForObject
                ("https://fakestoreapi.com/products/" + id, FakeProductServiceDtos.class);
        return convertDtoToPoduct(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product createProuct(String title, String description, String image, double price, String categoryName) {
        return null;
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
