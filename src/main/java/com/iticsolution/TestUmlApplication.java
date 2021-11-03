package com.iticsolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iticsolution.entities.Category;
import com.iticsolution.entities.Product;
import com.iticsolution.repositories.CategoryRepository;
import com.iticsolution.repositories.ProductRepositorie;
import com.iticsolution.services.ProductService;

@SpringBootApplication
public class TestUmlApplication implements CommandLineRunner{
	@Autowired
	ProductService productRepositorie;
	@Autowired
	CategoryRepository categoryRepository;
	
	/*
	 * public TestUmlApplication(ProductRepositorie
	 * productRepositorie,CategoryRepository categoryRepository) {
	 * this.productRepositorie=productRepositorie;
	 * this.categoryRepository=categoryRepository; }
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(TestUmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1=new Category("Cat1");
		categoryRepository.save(cat1);
		Category cat2=new Category("Cat2");
		Category categorySaved= categoryRepository.save(cat2);
		
		Product p1=new Product("Product1",100.66f );
		p1.setCategory(categorySaved);
		productRepositorie.addProduct(p1);
		
		
		
		
		
		
	}

}
