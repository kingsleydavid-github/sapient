package com.kingsley.sapient.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kingsley.sapient.model.Product;
import com.kingsley.sapient.service.ProductService;

@ComponentScan
@RestController
@RequestMapping("/product")

public class ProductApi {

	@Autowired
	private ProductService productService;
	

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/list")
	public @ResponseBody List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}
	
	@PutMapping("/add")
	public @ResponseBody Product addProduct( @RequestBody Product product)
	{
		return productService.add(product);
	}
}
