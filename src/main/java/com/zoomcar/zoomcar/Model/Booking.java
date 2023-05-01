package com.zoomcar.zoomcar.Model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Booking {

    private int id;
    private Vehicle vehicle;
    private User user;
    private Date pickupTime;
    private Date dropTime;
    private Date createdOn;
    private Adress adress;
    private BookingStatus status;


}
