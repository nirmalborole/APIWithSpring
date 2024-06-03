package com.kroger.aprfirstapi.representing_inheritence.single_table;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue(value = "1")
public class Lerner extends User {
    private String collge;
    private String company;


}
