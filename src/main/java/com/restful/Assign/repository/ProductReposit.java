package com.restful.Assign.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.Assign.model.Product;


public interface ProductReposit extends JpaRepository<Product,String>{

	
	List<Product> findByCategory(String catg,Pageable pageable);
}
