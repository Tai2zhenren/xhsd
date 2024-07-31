package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 商品存储库接口，继承JpaRepository，提供CRUD操作。
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
