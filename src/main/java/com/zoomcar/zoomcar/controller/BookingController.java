package com.zoomcar.zoomcar.controller;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class BookingController {


    @PostMapping(value ="/book")
    @ResponseBody Booking bookVehicle(@)

    @GetMapping(value ="/available/Vehicle")
    @ResponseBody Vehicle getAvailableVehicle(@RequestParam String from, @RequestParam Date to, @RequestParam VehicleType vehicleType){

        return new Vehicle();
    }
}
