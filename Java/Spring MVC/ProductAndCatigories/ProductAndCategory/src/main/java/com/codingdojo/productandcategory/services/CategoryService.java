package com.codingdojo.productandcategory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.productandcategory.models.Category;
import com.codingdojo.productandcategory.models.Product;
import com.codingdojo.productandcategory.repos.CategoryRepo;

@Service
public class CategoryService {
	@Autowired
	CategoryRepo categoryRepo;
	
	public List<Category> allCategories(){
		return categoryRepo.findAll();
	}
	public Category createCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	public Category findCategory(Long id) {
	    Optional<Category> optionalCategory= categoryRepo.findById(id);
	    if(optionalCategory.isPresent()) {
	        return optionalCategory.get();
	    } else {
	        return null;
	    }
}
	public List<Category> allCategoriesForProduct(Product product){

	        return categoryRepo.findAllByProducts(product);

		
	}
	public List<Category> notContainsCategories(Product product){
		return categoryRepo.findByProductsNotContains(product);
	}
	public Category saveProduct(Category category) {
		return categoryRepo.save(category);
	}
	
}
