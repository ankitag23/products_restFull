package com.restful.Assign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.Assign.model.Product;
import com.restful.Assign.repository.ProductReposit;

@RestController
public class ProductController {

	
	
	@Autowired
	ProductReposit prod_jpa_ser;
	
	@GetMapping(path="/products")
	@ResponseBody
	public List<Product> getProduct()
	{
		return prod_jpa_ser.findAll();
		//return prod_temp;
	}
	
	@GetMapping(path="/products/{catg}")
	@ResponseBody
	public List<Product> getProductByCategory(@PathVariable String catg)
	{
		Pageable pageable = PageRequest.of(0, 10);
		return prod_jpa_ser.findByCategory(catg,pageable);
		//return prod_temp;
	}
	@PostMapping(path="/product-create")
	public void insertProduct(@RequestBody Product prod)
	{
		Product prod_temp=prod_jpa_ser.save(prod);
		//return prod_temp;
	}
}
