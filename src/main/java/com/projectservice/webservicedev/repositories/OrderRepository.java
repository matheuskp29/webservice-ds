package com.projectservice.webservicedev.repositories;

import com.projectservice.webservicedev.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
