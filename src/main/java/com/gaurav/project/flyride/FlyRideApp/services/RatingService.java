package com.gaurav.project.flyride.FlyRideApp.services;

import com.gaurav.project.flyride.FlyRideApp.dto.DriverDto;
import com.gaurav.project.flyride.FlyRideApp.dto.RiderDto;
import com.gaurav.project.flyride.FlyRideApp.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
