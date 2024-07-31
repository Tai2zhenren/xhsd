package com.example.demo.repository;

import com.example.demo.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 订单项存储库接口，继承JpaRepository，提供CRUD操作。
 */
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
