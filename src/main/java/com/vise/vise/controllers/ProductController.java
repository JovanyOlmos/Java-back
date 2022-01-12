package com.vise.vise.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vise.vise.entities.Product;
import com.vise.vise.models.FieldDescriptor;
import com.vise.vise.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService _service;
	
	@CrossOrigin
	@GetMapping("/products")
	List<Product> getAll() {
		return _service.getAll();
	}
	
	@CrossOrigin
	@GetMapping("/product")
	Optional<Product> getProductById(@RequestParam(value = "id") Long id) {
		return _service.getById(id);
	}
	
	@CrossOrigin
	@GetMapping("/products/metadata")
	ArrayList<FieldDescriptor> getMetadata() {
		return _service.getMetadata();
	}
	
	@CrossOrigin
	@PostMapping("/product")
	void create(@RequestBody Product product) {
		_service.saveChanges(product);
	}
	
	@CrossOrigin
	@DeleteMapping("/product")
	void delete(@RequestParam(value = "id") Long id) {
		_service.delete(id);
	}
}
