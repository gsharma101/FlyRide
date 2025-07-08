package com.gaurav.project.flyride.FlyRideApp.services;

import com.gaurav.project.flyride.FlyRideApp.entities.Driver;
import com.gaurav.project.flyride.FlyRideApp.entities.Ride;
import com.gaurav.project.flyride.FlyRideApp.entities.RideRequest;
import com.gaurav.project.flyride.FlyRideApp.entities.Rider;
import com.gaurav.project.flyride.FlyRideApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    Ride createNewRide(RideRequest rideRequest, Driver driver);

    Ride updateRideStatus(Ride ride, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Rider rider, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Driver driver, PageRequest pageRequest);
}
