package com.gaurav.project.flyride.FlyRideApp.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {

    double calculateDistance(Point src, Point dest);
}
