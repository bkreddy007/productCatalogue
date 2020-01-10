package com.example.demo.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Iterable<Product> getAllProducts(String param) {

		switch (param) {
		case "BRAND":
			return getAllProductsGroupByBrand();
		case "PRICE":
			return getAllProductsGroupByPrice();
		case "COLOR":
			return getAllProductsGroupByColor();
		case "SIZE":
			return getAllProductsGroupBySize();
		case "SELLER":
			return groupBySeller();
		case "ALL":
			return productRepository.findAll();
		default:
			return new ArrayList<Product>();
		}
	}

	@Override
	public Product findById(long id) {
		return productRepository.findById(id).get();
	}

	private Iterable<Product> getAllProductsGroupByBrand() {
		return productRepository.groupByBrand();
	}

	private Iterable<Product> getAllProductsGroupByPrice() {
		return productRepository.groupByPrice();
	}

	private Iterable<Product> getAllProductsGroupByColor() {
		return productRepository.groupByColor();
	}

	private Iterable<Product> getAllProductsGroupBySize() {
		return productRepository.groupBySize();
	}

	@Override
	public Product findBySku(String skuno) {
		return productRepository.findBySku(skuno);
	}
	
	public Iterable<Product> groupBySeller() {
		return productRepository.groupBySeller();
	}

}
