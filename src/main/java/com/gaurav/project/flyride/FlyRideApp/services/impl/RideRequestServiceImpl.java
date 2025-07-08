package com.gaurav.project.flyride.FlyRideApp.services.impl;

import com.gaurav.project.flyride.FlyRideApp.entities.RideRequest;
import com.gaurav.project.flyride.FlyRideApp.exceptions.ResourceNotFoundException;
import com.gaurav.project.flyride.FlyRideApp.repositories.RideRequestRepository;
import com.gaurav.project.flyride.FlyRideApp.services.RideRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideRequestServiceImpl implements RideRequestService {

    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequest findRideRequestById(Long rideRequestId) {
        return rideRequestRepository.findById(rideRequestId)
                .orElseThrow(() -> new ResourceNotFoundException("RideRequest not found with id: "+rideRequestId));
    }

    @Override
    public void update(RideRequest rideRequest) {
        rideRequestRepository.findById(rideRequest.getId())
                .orElseThrow(() -> new ResourceNotFoundException("RideRequest not found with id: "+rideRequest.getId()));
        rideRequestRepository.save(rideRequest);
    }
}
