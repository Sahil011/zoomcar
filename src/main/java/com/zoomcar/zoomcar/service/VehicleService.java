package com.zoomcar.zoomcar.service;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;

import java.util.Date;
import java.util.List;

public interface VehicleService {

    public Vehicle addVehicle(Vehicle vehicle);

    public List<Vehicle> getAvailableVehicles(Date from, Date to, VehicleType type);

}
