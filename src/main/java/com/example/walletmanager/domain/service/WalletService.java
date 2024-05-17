package com.example.walletmanager.domain.service;

import com.example.walletmanager.domain.entity.Wallet;
import com.example.walletmanager.infra.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletService {

    private final WalletRepository walletRepository;

    public Wallet save(Wallet wallet) {
        return walletRepository.save(wallet);
    }
}