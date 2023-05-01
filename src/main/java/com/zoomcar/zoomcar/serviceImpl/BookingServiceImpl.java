package com.zoomcar.zoomcar.serviceImpl;

import com.zoomcar.zoomcar.Model.Vehicle;
import com.zoomcar.zoomcar.Model.VehicleType;
import com.zoomcar.zoomcar.service.BookingService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class BookingServiceImpl implements BookingService {
    @Override
    public Vehicle getAvailableVehicle(Date from, Date to, List<VehicleType> type) throws Exception {
        // validate filter params


        // contruct filter and get data
        if(Objects.isNull(from)||Objects.isNull(to) ){
            throw new Exception("Select picking and drop time to check the vehicle availabilty");
        }
        else if(Objects.isNull(type) || type.size()<1){



        } else if () {

        }


        // parse response and return


        return new Vehicle();
    }
}
