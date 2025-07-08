package com.gaurav.project.flyride.FlyRideApp.services;

import com.gaurav.project.flyride.FlyRideApp.entities.Ride;
import com.gaurav.project.flyride.FlyRideApp.entities.User;
import com.gaurav.project.flyride.FlyRideApp.entities.Wallet;
import com.gaurav.project.flyride.FlyRideApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);

}
