package com.codingdojo.productandcategory.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productandcategory.models.Category;
import com.codingdojo.productandcategory.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product,Long> {
 List<Product> findAll();
 List<Product> findAllByCategories(Category category);
 
 // Retrieves a list of any categories a particular product
 // does not belong to.
 List<Product> findByCategoriesNotContains(Category category);
 
}
