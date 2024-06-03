package com.kroger.aprfirstapi.representing_inheritence.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "msc_TA")
public class TA extends User{
    private double avg_Rating;
    private String college;

}
