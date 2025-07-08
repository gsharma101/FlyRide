package com.gaurav.project.flyride.FlyRideApp.repositories;

import com.gaurav.project.flyride.FlyRideApp.entities.Payment;
import com.gaurav.project.flyride.FlyRideApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Optional<Payment> findByRide(Ride ride);
}
