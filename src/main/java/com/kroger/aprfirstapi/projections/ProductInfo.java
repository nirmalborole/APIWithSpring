package com.kroger.aprfirstapi.projections;

import com.kroger.aprfirstapi.models.Category;

public interface ProductInfo {
    String getTitle();
    Category getCategory();
    long getId();
}