package com.gaurav.project.flyride.FlyRideApp.strategies;

import com.gaurav.project.flyride.FlyRideApp.entities.Driver;
import com.gaurav.project.flyride.FlyRideApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
