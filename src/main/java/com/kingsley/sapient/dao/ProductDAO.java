package com.kingsley.sapient.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingsley.sapient.model.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

	public Product add(Product product);
	public List<Product> findAll(); 
	
}
