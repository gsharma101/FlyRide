package com.gaurav.project.flyride.FlyRideApp.strategies;

import com.gaurav.project.flyride.FlyRideApp.entities.Payment;

public interface PaymentStrategy {
    Double PLATFORM_COMMISSION = 0.3;
    void processPayment(Payment payment);

}
