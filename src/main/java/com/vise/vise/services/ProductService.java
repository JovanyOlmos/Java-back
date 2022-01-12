package com.vise.vise.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vise.vise.ServiceBase;
import com.vise.vise.entities.Product;
import com.vise.vise.models.FieldDescriptor;
import com.vise.vise.repositories.iProduct;

@Service
@Transactional
public class ProductService extends ServiceBase {
	
	@Autowired
	private iProduct _product;
	
	public List<Product> getAll() {
		return _product.findAll();
	}
	
	public Optional<Product> getById(Long id) {
		return _product.findById(id);
	}
	
	public ArrayList<FieldDescriptor> getMetadata() {
		return super.getMetadata(new Product());
	}
	
	public void saveChanges(Product product) {
		_product.save(product);
	}
	
	public void delete(Long id) {
		_product.deleteById(id);
	}
}