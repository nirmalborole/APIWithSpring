package com.kroger.aprfirstapi.representing_inheritence.table_per_class;

import lombok.Data;

@Data
public class Mentor extends User {
    private String company;
    private double avgRating;

}
