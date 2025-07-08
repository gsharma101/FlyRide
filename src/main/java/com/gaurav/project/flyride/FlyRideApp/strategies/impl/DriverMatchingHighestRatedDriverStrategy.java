package com.gaurav.project.flyride.FlyRideApp.strategies.impl;

import com.gaurav.project.flyride.FlyRideApp.entities.Driver;
import com.gaurav.project.flyride.FlyRideApp.entities.RideRequest;
import com.gaurav.project.flyride.FlyRideApp.repositories.DriverRepository;
import com.gaurav.project.flyride.FlyRideApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional()
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickupLocation());
    }
}
