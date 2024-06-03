package com.kroger.aprfirstapi.representing_inheritence.table_per_class;

import lombok.Data;

@Data
public class TA extends User {
    private double avg_Rating;
    private String college;

}
