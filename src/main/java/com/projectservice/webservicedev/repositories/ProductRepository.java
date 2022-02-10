package com.projectservice.webservicedev.repositories;

import com.projectservice.webservicedev.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
