package com.booking_service.entity;

public class PaymentStatusResponse {
    private String status;

    public PaymentStatusResponse(String status) { this.status = status; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
