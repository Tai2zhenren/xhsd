package com.example.demo.repository;

import com.example.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 订单存储库接口，继承JpaRepository，提供CRUD操作。
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
