package com.kroger.aprfirstapi.representing_inheritence.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@DiscriminatorValue(value = "2")
@Entity
public class Mentor extends User {
    private String company;
    private double avgRating;

}
