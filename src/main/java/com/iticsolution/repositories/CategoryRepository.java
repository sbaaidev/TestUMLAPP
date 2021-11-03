package com.iticsolution.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iticsolution.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
