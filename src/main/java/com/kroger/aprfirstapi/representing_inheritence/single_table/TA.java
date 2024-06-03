package com.kroger.aprfirstapi.representing_inheritence.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@DiscriminatorValue(value = "3")
@Entity
public class TA extends User {
    private double avgRating;
    private String college;

}
