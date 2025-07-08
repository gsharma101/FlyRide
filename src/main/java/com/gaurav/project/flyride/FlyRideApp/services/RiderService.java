package com.gaurav.project.flyride.FlyRideApp.services;

import com.gaurav.project.flyride.FlyRideApp.dto.DriverDto;
import com.gaurav.project.flyride.FlyRideApp.dto.RideDto;
import com.gaurav.project.flyride.FlyRideApp.dto.RideRequestDto;
import com.gaurav.project.flyride.FlyRideApp.dto.RiderDto;
import com.gaurav.project.flyride.FlyRideApp.entities.Rider;
import com.gaurav.project.flyride.FlyRideApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
