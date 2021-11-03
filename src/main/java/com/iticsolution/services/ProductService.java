package com.iticsolution.services;

import java.util.List;

import com.iticsolution.entities.Product;

public interface ProductService {
public Product addProduct(Product p);
public Product updateProduct(Product p);
public void deleteProduct(Long id);
public List<Product> getAllProducts();
}
