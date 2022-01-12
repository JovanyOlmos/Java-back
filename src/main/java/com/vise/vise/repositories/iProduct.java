package com.vise.vise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vise.vise.entities.Product;

public interface iProduct extends JpaRepository<Product, Long> {

}
