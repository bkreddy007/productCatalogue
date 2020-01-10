package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping(value = { "", "{id}" })
	public Iterable<Product> getProduct(@PathVariable("id") Optional<Long> id,
			@RequestParam(name = "groupby", required = false) Optional<String> groupby,
			@RequestParam(name = "sku", required = false) Optional<String> sku) {
		if (id.isPresent()) {
			Product p = productService.findById(id.get());
			ArrayList<Product> a = new ArrayList<>();
			a.add(p);
			return a;
		} else if (sku.isPresent()) {
			Product p = productService.findBySku(sku.get());
			ArrayList<Product> a = new ArrayList<>();
			a.add(p);
			return a;
		} else if (groupby.isPresent()) {
			return productService.getAllProducts(groupby.get());
		} else {
			return productService.getAllProducts("ALL");
		}
	}

}
