package com.codingdojo.productandcategory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.productandcategory.models.Category;
import com.codingdojo.productandcategory.models.Product;
import com.codingdojo.productandcategory.repos.ProductRepo;

@Service
public class ProductService {
@Autowired
ProductRepo productRepo;

public List<Product> allProduct(){
	return productRepo.findAll();
}

public Product createProduct(Product product) {
	return productRepo.save(product);
}

public Product findProduct(Long id) {
    Optional<Product> optionalProduct = productRepo.findById(id);
    if(optionalProduct.isPresent()) {
        return optionalProduct.get();
    } else {
        return null;
    }
}
public Product saveCategory(Product product) {
	return productRepo.save(product);
}
public List<Product> allProductsForCategory(Category category){

    return productRepo.findAllByCategories(category);


}
public List<Product> notContainsProducts(Category category){
return productRepo.findByCategoriesNotContains(category);
}
}
