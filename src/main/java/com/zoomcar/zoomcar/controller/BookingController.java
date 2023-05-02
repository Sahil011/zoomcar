package com.zoomcar.zoomcar.controller;

import com.zoomcar.zoomcar.Model.Booking;
import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;
import com.zoomcar.zoomcar.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class BookingController {

    @Autowired
    public BookingService bookingService;

    @PostMapping(value ="/book")
    @ResponseBody
    public Booking bookVehicle(@RequestParam Vehicle vehicle){

        return new Booking();
    }
}
