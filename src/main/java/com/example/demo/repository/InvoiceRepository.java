package com.example.demo.repository;

import com.example.demo.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 发票存储库接口，继承JpaRepository，提供CRUD操作。
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
