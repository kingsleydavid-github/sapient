package com.kingsley.sapient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kingsley.sapient.model.Product;
import com.kingsley.sapient.repo.ProductRepo;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepo productdao;
	
	public List<Product> getAllProducts() {
	return productdao.findAll();
	}
	
	public Product add(Product product)
	{
		return productdao.save(product);
	}
}
