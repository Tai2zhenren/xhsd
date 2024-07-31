package com.example.demo.dto;

/**
 * 供应商请求DTO，封装供应商请求数据。
 */
public class SupplierRequest {
    private String name;
    private String contactInfo;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
