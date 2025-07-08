package com.gaurav.project.flyride.FlyRideApp.services;

import com.gaurav.project.flyride.FlyRideApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
