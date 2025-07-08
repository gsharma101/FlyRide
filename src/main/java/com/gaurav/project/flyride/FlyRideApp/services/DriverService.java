package com.gaurav.project.flyride.FlyRideApp.services;

import com.gaurav.project.flyride.FlyRideApp.dto.DriverDto;
import com.gaurav.project.flyride.FlyRideApp.dto.RideDto;
import com.gaurav.project.flyride.FlyRideApp.dto.RiderDto;
import com.gaurav.project.flyride.FlyRideApp.entities.Driver;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface DriverService {

    RideDto acceptRide(Long rideRequestId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId, String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Driver getCurrentDriver();

    Driver updateDriverAvailability(Driver driver, boolean available);

    Driver createNewDriver(Driver driver);
}
