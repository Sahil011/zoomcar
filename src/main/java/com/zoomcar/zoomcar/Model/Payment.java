package com.zoomcar.zoomcar.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Payment {
    private int id;
    private Booking booking;
    private int amount;
    private PaymentStatus status;
    private PaymentMode mode;
    private String gatewayRef;

}
