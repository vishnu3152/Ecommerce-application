package com.vishnu.ecommerce.dao;

import org.springframework.data.domain.Page;
import com.vishnu.ecommerce.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")     //Accept calls from Web browser scripts for this origin
public interface ProductRepository extends JpaRepository<Product, Long> {    // Here we have given Entity type and Primary Key as Long

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);   // This is a Query Method (Behind the scenes, Spring will execute a query similar to this SELECT * FROM product where category_id=?)

    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);
}