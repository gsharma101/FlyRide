package com.gaurav.project.flyride.FlyRideApp.strategies;

import com.gaurav.project.flyride.FlyRideApp.entities.enums.PaymentMethod;
import com.gaurav.project.flyride.FlyRideApp.strategies.impl.CashPaymentStrategy;
import com.gaurav.project.flyride.FlyRideApp.strategies.impl.WalletPaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentStrategyManager {

    private final WalletPaymentStrategy walletPaymentStrategy;
    private final CashPaymentStrategy cashPaymentStrategy;

    public PaymentStrategy paymentStrategy(PaymentMethod paymentMethod) {
        return switch (paymentMethod) {
            case WALLET -> walletPaymentStrategy;
            case CASH -> cashPaymentStrategy;
        };
    }
}
