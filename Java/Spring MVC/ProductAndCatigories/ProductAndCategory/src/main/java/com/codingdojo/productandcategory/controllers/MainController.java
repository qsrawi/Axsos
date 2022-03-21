package com.codingdojo.productandcategory.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.productandcategory.models.Category;
import com.codingdojo.productandcategory.models.Product;
import com.codingdojo.productandcategory.services.CategoryService;
import com.codingdojo.productandcategory.services.ProductService;



@Controller
public class MainController {
@Autowired
ProductService productService;
@Autowired
CategoryService categoryService;

@GetMapping("/product/new")
public String productHome(@ModelAttribute("products")Product product) {

	return "indexproduct.jsp";
}


@PostMapping("/product/new")
public String createProduct(@Valid @ModelAttribute("products")Product product,BindingResult result ) {
	 if (result.hasErrors()) {
	        return "indexproduct.jsp";
	    } else {
	    	
	    	productService.createProduct(product);
	    	Long id=product.getId();
	        return "redirect:/product/"+id;
	    }
	 }

//////////////////////////////////////////////////////////
@GetMapping("product/{id}")
public String showProduct(@PathVariable("id") Long id,Model model,@ModelAttribute("category")Category category) {
	Product product=productService.findProduct(id);
	System.out.println("this "+product);
	List<Category> addedCategories = categoryService.allCategoriesForProduct(product);
	List<Category> notIncluded = categoryService.notContainsCategories(product);
	System.out.println(addedCategories);
	System.out.println(notIncluded);
	model.addAttribute("product",product);
	model.addAttribute("addedCategories",addedCategories);
	model.addAttribute("notIncluded",notIncluded);
	return "productpage.jsp";
	
}
@PostMapping("product/{id}")
public String addCategory(@PathVariable("id") Long id,Model model,@ModelAttribute("category")Category category,BindingResult result) {
	 if (result.hasErrors()) {
	        return "productpage.jsp";
	    } else {
	    	Product thisProduct=productService.findProduct(id);
	    	thisProduct.getCategories().add(category);
	    	productService.saveCategory(thisProduct);
	    	
	        return "redirect:/product/"+id;
	    }
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////
@GetMapping("/category/new")
public String categoryHome(@ModelAttribute("category")Category category) {

	return "indexcategory.jsp";
}

@PostMapping("/category/new")
public String createCategory(@Valid @ModelAttribute("category")Category category,BindingResult result ) {
	 if (result.hasErrors()) {
	        return "indexcategory.jsp";
	    } else {
	    	
	    	categoryService.createCategory(category);
	    	Long id=category.getId();
	        return "redirect:/category/"+id;
	    }
	 
}

//////////////////////////////////////////////////////////////////////////////////////////
@GetMapping("category/{id}")
public String showCategory(@PathVariable("id") Long id,Model model,@ModelAttribute("products")Product product) {
	Category category=categoryService.findCategory(id);
	System.out.println("this "+category);
	List<Product> addedProducts = productService.allProductsForCategory(category);
	List<Product> notIncluded = productService.notContainsProducts(category);
	System.out.println(addedProducts);
	System.out.println(notIncluded);
	model.addAttribute("category",category);
	model.addAttribute("addedProducts",addedProducts);
	model.addAttribute("notIncluded",notIncluded);
	return "categorypage.jsp";
	
}
@PostMapping("category/{id}")
public String addproduct(@PathVariable("id") Long id,Model model,@ModelAttribute("products")Product product,BindingResult result) {
	 if (result.hasErrors()) {
	        return "categorypage.jsp";
	    } else {
	    	Category thisCategory=categoryService.findCategory(id);
	    	thisCategory.getProducts().add(product);
	    	categoryService.saveProduct(thisCategory);
	    	
	        return "redirect:/category/"+id;
	    }
	
}
}
