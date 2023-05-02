package com.zoomcar.zoomcar.serviceImpl;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;
import com.zoomcar.zoomcar.repository.BookingRepo;
import com.zoomcar.zoomcar.repository.VehiclesRepo;
import com.zoomcar.zoomcar.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class VehicleServiceImpl implements VehicleService {

    @Autowired
    public VehiclesRepo vehicleRepo;

    @Autowired
    public BookingRepo bookingRepo;

    @Override
    public Vehicle addVehicle(Vehicle vehicle) {
        return null;
    }

    @Override
    public List<Vehicle> getAvailableVehicles(Date from, Date to, VehicleType type) {
        return null;
    }
}
