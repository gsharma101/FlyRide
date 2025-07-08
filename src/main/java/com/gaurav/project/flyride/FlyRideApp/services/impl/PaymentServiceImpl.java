package com.gaurav.project.flyride.FlyRideApp.services.impl;

import com.gaurav.project.flyride.FlyRideApp.entities.Payment;
import com.gaurav.project.flyride.FlyRideApp.entities.Ride;
import com.gaurav.project.flyride.FlyRideApp.entities.enums.PaymentStatus;
import com.gaurav.project.flyride.FlyRideApp.exceptions.ResourceNotFoundException;
import com.gaurav.project.flyride.FlyRideApp.repositories.PaymentRepository;
import com.gaurav.project.flyride.FlyRideApp.services.PaymentService;
import com.gaurav.project.flyride.FlyRideApp.strategies.PaymentStrategyManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final PaymentStrategyManager paymentStrategyManager;

    @Override
    public void processPayment(Ride ride) {
        Payment payment = paymentRepository.findByRide(ride)
                        .orElseThrow(() -> new ResourceNotFoundException("Payment not found for ride with id: "+ride.getId()));
        paymentStrategyManager.paymentStrategy(payment.getPaymentMethod()).processPayment(payment);
    }

    @Override
    public Payment createNewPayment(Ride ride) {
        Payment payment = Payment.builder()
                .ride(ride)
                .paymentMethod(ride.getPaymentMethod())
                .amount(ride.getFare())
                .paymentStatus(PaymentStatus.PENDING)
                .build();
        return paymentRepository.save(payment);
    }

    @Override
    public void updatePaymentStatus(Payment payment, PaymentStatus status) {
        payment.setPaymentStatus(status);
        paymentRepository.save(payment);
    }
}
