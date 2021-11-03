package com.iticsolution.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iticsolution.entities.Product;
import com.iticsolution.services.ProductService;

@RestController

public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value  = "api/products",method = RequestMethod.GET)
	public List<Product> getListProduct(){
		return productService.getAllProducts();
	}
}
