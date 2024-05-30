package com.kroger.aprfirstapi.dtos;

import com.kroger.aprfirstapi.models.Category;
import lombok.Data;

@Data
public class FakeProductServiceDtos {
    private long id;
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;
}
