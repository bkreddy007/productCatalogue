package com.example.demo.service;

import com.example.demo.entity.Product;

public interface ProductService {
	Iterable<Product> getAllProducts(String param);

	Product findById(long id);

	Product findBySku(String skuno);

}
