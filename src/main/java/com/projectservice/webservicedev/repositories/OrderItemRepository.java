package com.projectservice.webservicedev.repositories;

import com.projectservice.webservicedev.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
