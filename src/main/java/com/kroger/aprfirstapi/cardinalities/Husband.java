package com.kroger.aprfirstapi.cardinalities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Husband {
    @Id
    private long id;
    private String name;
    @OneToOne(mappedBy = "husband")
    private Wife wife;

}
