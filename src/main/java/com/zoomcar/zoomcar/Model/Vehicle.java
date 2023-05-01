package com.zoomcar.zoomcar.Model;

import lombok.Data;

@Data
public class Vehicle implements Comparable<Vehicle>{

    private int id;
    private String vehicleNumber;
    private String description;
    private VehicleType type;
    private Integer distanceCovered;

    private VehicleState status;

    @Override
    public int compareTo(Vehicle o) {
        return this.getVehicleNumber().compareTo(o.getVehicleNumber());
    }

}
