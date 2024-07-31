package com.example.demo.dto;

/**
 * 商品请求DTO，封装商品请求数据。
 */
public class ProductRequest {
    private String name;
    private String description;
    private Double price;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
