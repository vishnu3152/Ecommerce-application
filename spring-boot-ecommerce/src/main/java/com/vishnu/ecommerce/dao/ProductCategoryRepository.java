package com.vishnu.ecommerce.dao;

import com.vishnu.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")     //Accept calls from Web browser scripts for this origin
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")   // This gives name of the JSON ENTRY and the path of the resource (reference)
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {    //Here we have given Entity type and Primary Key as Long


}
