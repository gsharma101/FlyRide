package com.gaurav.project.flyride.FlyRideApp.strategies;

import com.gaurav.project.flyride.FlyRideApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);

}
