package com.projectservice.webservicedev.repositories;

import com.projectservice.webservicedev.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
