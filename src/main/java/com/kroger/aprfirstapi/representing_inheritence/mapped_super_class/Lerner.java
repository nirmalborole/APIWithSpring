package com.kroger.aprfirstapi.representing_inheritence.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_lerner")
public class Lerner extends User{
    private String collge;
    private String company;


}
