package com.gaurav.project.flyride.FlyRideApp.repositories;

import com.gaurav.project.flyride.FlyRideApp.entities.Driver;
import com.gaurav.project.flyride.FlyRideApp.entities.Rating;
import com.gaurav.project.flyride.FlyRideApp.entities.Ride;
import com.gaurav.project.flyride.FlyRideApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
