package com.example.demo.repository;

import com.example.demo.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 物流存储库接口，继承JpaRepository，提供CRUD操作。
 */
@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
