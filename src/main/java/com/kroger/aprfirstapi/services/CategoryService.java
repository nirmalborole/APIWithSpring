package com.kroger.aprfirstapi.services;

import com.kroger.aprfirstapi.models.Category;
import com.kroger.aprfirstapi.models.Product;

public interface CategoryService {
    public Category createCategory(String name);
}
