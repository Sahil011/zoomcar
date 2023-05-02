package com.zoomcar.zoomcar.repository;

import com.zoomcar.zoomcar.Model.*;
import com.zoomcar.zoomcar.Utils.BookingHelper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
@Data
public class BookingRepo {

    @Autowired
    private VehiclesRepo vehiclesRepo;

    List<Booking> bookings =  new ArrayList<>();
    Map<Integer, Booking> bookingMap = new HashMap<>();
    Map<Integer, List<Booking>> vehicleBookings = new HashMap<>();
    public Booking createBooking(Booking bookingDto) throws Exception {
        for(Booking booking : bookings){
            if(booking.getVehicle().equals(booking.getVehicle()) && BookingHelper.bookingAvailable(booking, bookingDto)){
                throw new Exception("Can't be booked as booking is already present for vehicle No:-> "+booking.getVehicle().getVehicleNumber());
            }
        }
        bookingDto.setId(bookings.size()+1);
        bookings.add(bookingDto);
        bookingMap.put(bookingDto.getId(), bookingDto);
        vehicleBookings.getOrDefault(bookingDto.getVehicle().getId(), new ArrayList<Booking>()).add(bookingDto);
        return bookingDto;
    }

    public List<Vehicle> getAvailableVehicles(Date from, Date to, VehicleType type){
        List<Vehicle> vehicleList = new ArrayList<Vehicle>();
        if(Objects.nonNull(from) && Objects.nonNull(to) && Objects.nonNull(type)){
            for(Vehicle vehicle : vehiclesRepo.getVehicles()){
                if(vehicle.equals(type) &&
                        isVehicleAvailable(vehicle, from , to) &&
                                vehicle.getStatus().equals(VehicleState.ACTIVE))
                                        vehicleList.add(vehicle);
            }
        }else if(Objects.nonNull(type)){
            for(Vehicle vehicle : vehiclesRepo.getVehicles()){
                if(vehicle.equals(type) &&
                        vehicle.getStatus().equals(VehicleState.ACTIVE))
                    vehicleList.add(vehicle);
            }
        }else {
            for(Vehicle vehicle : vehiclesRepo.getVehicles()){
                if(vehicle.getStatus().equals(VehicleState.ACTIVE))
                    vehicleList.add(vehicle);
            }
        }
        return vehicleList;
    }

    private boolean isVehicleAvailable(Vehicle vehicle, Date from, Date to) {
        if(!vehicleBookings.containsKey(vehicle.getId()))return true;
        else {
            for(Booking booking : vehicleBookings.get(vehicle.getId())){
                if(!BookingHelper.bookingAvailable(booking, from, to)){
                    return false;
                }
            }
        }return true;
    }

    private Booking vehiclePickup(Booking booking, Date date){
        if(bookingMap.containsKey(booking.getId()) && BookingStatus.CONFIRMED.equals(bookingMap.get(booking.getId()).getStatus())/* && same user has booking*/)
            bookingMap.get(booking.getId()).setPickupTime(date);
        return bookingMap.get(booking.getId());
    }

    private Booking vehicleDrop(Booking booking, Date date){
        if(bookingMap.containsKey(booking.getId()) && BookingStatus.CONFIRMED.equals(bookingMap.get(booking.getId()).getStatus())/* && same user has booking*/)
            bookingMap.get(booking.getId()).setDropTime(date);
        return bookingMap.get(booking.getId());
    }

}
