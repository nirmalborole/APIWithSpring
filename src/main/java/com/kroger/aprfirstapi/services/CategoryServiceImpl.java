package com.kroger.aprfirstapi.services;

import com.kroger.aprfirstapi.models.Category;
import com.kroger.aprfirstapi.repositories.Categoryrepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{
    private Categoryrepositoy categoryrepositoy;
    @Autowired
    public CategoryServiceImpl(Categoryrepositoy categoryrepositoy) {
        this.categoryrepositoy = categoryrepositoy;
    }

    @Override
    public Category createCategory(String name) {
        Category category = new Category();
        category.setName(name);
        Category save = categoryrepositoy.save(category);
        return save;
    }
}
