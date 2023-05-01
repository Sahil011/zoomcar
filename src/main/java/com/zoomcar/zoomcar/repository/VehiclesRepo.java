package com.zoomcar.zoomcar.repository;

import com.zoomcar.zoomcar.Model.Vehicle;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class VehiclesRepo {

    private List<Vehicle> vehicles = new ArrayList<>();

    private Vehicle addVehicle(Vehicle vehicle){
        //validate if vehicle exists
        vehicles.add(vehicle);
        return vehicle;
    }

    private Vehicle updateVehicle(Vehicle vehicle){
        //validate and update
        return vehicle;
    }


}
