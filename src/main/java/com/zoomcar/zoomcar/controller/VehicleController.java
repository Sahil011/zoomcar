package com.zoomcar.zoomcar.controller;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;
import com.zoomcar.zoomcar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
    public List<Vehicle> getAvailableVehicle(@RequestParam Date from, @RequestParam Date to, @RequestParam VehicleType vehicleType){

        return vehicleService.getAvailableVehicles(from, to , vehicleType);
    }
}
