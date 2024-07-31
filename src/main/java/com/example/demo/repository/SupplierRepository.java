package com.example.demo.repository;

import com.example.demo.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 供应商存储库接口，继承JpaRepository，提供CRUD操作。
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
