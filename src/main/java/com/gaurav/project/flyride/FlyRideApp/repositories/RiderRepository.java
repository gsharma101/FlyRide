package com.gaurav.project.flyride.FlyRideApp.repositories;

import com.gaurav.project.flyride.FlyRideApp.entities.Rider;
import com.gaurav.project.flyride.FlyRideApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
    Optional<Rider> findByUser(User user);
}
