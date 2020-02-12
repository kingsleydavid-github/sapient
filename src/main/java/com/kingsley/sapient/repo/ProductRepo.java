package com.kingsley.sapient.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kingsley.sapient.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
