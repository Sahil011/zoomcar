package com.zoomcar.zoomcar.controller;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;
import com.zoomcar.zoomcar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class VehicleController {

    @Autowired
    public VehicleService vehicleService;

    @PostMapping(value = "add/vehicle")
    public Vehicle addVehicle(@RequestParam Vehicle vehicle){

        return vehicleService.addVehicle(vehicle);
    }

    @GetMapping(value ="/available/Vehicle")
    @ResponseBody
    public Vehicle getAvailableVehicle(@RequestParam String from, @RequestParam Date to, @RequestParam VehicleType vehicleType){

        return new Vehicle();
    }
}
