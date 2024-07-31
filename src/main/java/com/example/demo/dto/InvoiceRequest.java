package com.example.demo.dto;

/**
 * 发票请求DTO，封装发票请求数据。
 */
public class InvoiceRequest {
    private String invoiceNumber;
    private Double amount;
    private String status;

    // Getters and setters
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
