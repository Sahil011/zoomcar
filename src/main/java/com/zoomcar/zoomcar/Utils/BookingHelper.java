package com.zoomcar.zoomcar.Utils;

import com.zoomcar.zoomcar.Model.Booking;
import com.zoomcar.zoomcar.Model.Vehicle;

import java.util.Date;

public class BookingHelper {

    public static boolean bookingAvailable(Booking bookingpresent, Booking bookingToBeAdded){
        if((bookingpresent.getPickupTime().before(bookingToBeAdded.getPickupTime()) &&
                bookingpresent.getDropTime().before(bookingToBeAdded.getPickupTime()))
            || (bookingpresent.getPickupTime().after(bookingToBeAdded.getDropTime())))
            return true;
        return false;
    }

    public static boolean bookingAvailable(Booking bookingpresent, Date from , Date to){
        if((bookingpresent.getPickupTime().before(from) && bookingpresent.getDropTime().before(from))
                || (bookingpresent.getPickupTime().after(to)))
                        return true;
        return false;
    }

}
