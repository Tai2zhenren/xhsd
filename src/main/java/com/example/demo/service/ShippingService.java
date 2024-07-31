package com.example.demo.service;

import com.example.demo.model.Shipping;
import com.example.demo.repository.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 物流服务类，处理物流相关的业务逻辑。
 */
@Service
public class ShippingService {
    @Autowired
    private ShippingRepository shippingRepository;

    public List<Shipping> findAll() {
        return shippingRepository.findAll();
    }

    public Shipping findById(Long id) {
        return shippingRepository.findById(id).orElse(null);
    }

    public Shipping save(Shipping shipping) {
        return shippingRepository.save(shipping);
    }

    public void delete(Shipping shipping) {
        shippingRepository.delete(shipping);
    }
}
