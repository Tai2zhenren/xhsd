package com.example.demo.dto;

/**
 * 物流请求DTO，封装物流请求数据。
 */
public class ShippingRequest {
    private String trackingNumber;
    private String status;

    // Getters and setters
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
