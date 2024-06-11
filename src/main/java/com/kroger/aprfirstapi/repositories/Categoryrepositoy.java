package com.kroger.aprfirstapi.repositories;

import com.kroger.aprfirstapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categoryrepositoy extends JpaRepository<Category, Long> {
}
