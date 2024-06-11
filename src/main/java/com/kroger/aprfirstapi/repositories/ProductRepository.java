package com.kroger.aprfirstapi.repositories;

import com.kroger.aprfirstapi.models.Category;
import com.kroger.aprfirstapi.models.Product;
import com.kroger.aprfirstapi.projections.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@RequestMapping
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findById(long id);

    List<Product> findByIdIn(List<Long>id);

    List<Product> findAllByCategoryAndDescription(Category category, String description);


    // HQL -> SQL + Oops
    @Query("select p.title, p.category from Product p where p.id= :id")
    Optional<ProductInfo> getByIdCustom(@Param("id") long id);
}

