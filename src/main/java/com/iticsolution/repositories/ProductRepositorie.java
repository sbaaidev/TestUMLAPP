package com.iticsolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iticsolution.entities.Product;

public interface ProductRepositorie  extends JpaRepository<Product, Long>{

}
