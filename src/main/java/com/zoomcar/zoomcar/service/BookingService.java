package com.zoomcar.zoomcar.service;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;

import java.util.Date;
import java.util.List;

public interface BookingService {

    Vehicle getAvailableVehicle(Date from, Date to, List<VehicleType> type) throws Exception;
}
