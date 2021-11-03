package com.iticsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticsolution.entities.Product;
import com.iticsolution.repositories.ProductRepositorie;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
ProductRepositorie dboperation;
	@Override
	public Product addProduct(Product p) {
		// TODO Auto-generated method stub
		return dboperation.save(p);
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return dboperation.save(p);
	}

	@Override
	public void deleteProduct(Long id) {
		dboperation.deleteById(id);

	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dboperation.findAll();
	}

}
