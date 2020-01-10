package com.example.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p GROUP BY p.brand,p.id")
	Collection<Product> groupByBrand();

	@Query("SELECT p FROM Product p GROUP BY p.price,p.id")
	Collection<Product> groupByPrice();

	@Query("SELECT p FROM Product p GROUP BY p.color,p.id")
	Collection<Product> groupByColor();

	@Query("SELECT p FROM Product p GROUP BY p.size,p.id")
	Collection<Product> groupBySize();

	Product findBySku(String sku);

	@Query("SELECT p FROM Product p GROUP BY p.seller,p.id")
	Collection<Product> groupBySeller();

}
