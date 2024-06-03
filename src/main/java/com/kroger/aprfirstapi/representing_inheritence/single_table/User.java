package com.kroger.aprfirstapi.representing_inheritence.single_table;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Inheritance
@Entity(name = "single_table")
@DiscriminatorColumn(
        name = "user_type",
        discriminatorType = DiscriminatorType.INTEGER
)
@DiscriminatorValue(value = "0")
public class User {
    @Id
    private long id;
    private String name;
    private String email;
    private String password;

}
