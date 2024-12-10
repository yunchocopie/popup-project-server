package com.example.popupprojectserver.repository;

import com.example.popupprojectserver.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}