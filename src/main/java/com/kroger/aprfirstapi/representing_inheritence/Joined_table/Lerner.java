package com.kroger.aprfirstapi.representing_inheritence.Joined_table;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Data
@Entity(name = "jt_lernaer")
@PrimaryKeyJoinColumn(name = "user_id")
public class Lerner extends User {
    private String collge;
    private String company;


}
