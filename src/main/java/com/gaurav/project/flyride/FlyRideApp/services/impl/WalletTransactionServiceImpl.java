package com.gaurav.project.flyride.FlyRideApp.services.impl;

import com.gaurav.project.flyride.FlyRideApp.entities.WalletTransaction;
import com.gaurav.project.flyride.FlyRideApp.repositories.WalletTransactionRepository;
import com.gaurav.project.flyride.FlyRideApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {

    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransaction walletTransaction) {
        walletTransactionRepository.save(walletTransaction);
    }

}
