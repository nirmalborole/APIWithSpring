package com.kroger.aprfirstapi.dtos;

import com.kroger.aprfirstapi.models.Category;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class CreateProductRequestDto {
    private String title;
    private double price;
    private String description;
    private String image;
    private String categoryname;
}
