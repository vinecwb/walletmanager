package com.example.walletmanager.walletmanager;

import com.example.walletmanager.domain.entity.Wallet;
import com.example.walletmanager.domain.service.WalletService;
import com.example.walletmanager.infra.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class WalletManagerServiceImpl {

    private final WalletService walletService;

    @Autowired
    private WalletRepository walletRepository;

    @Transactional
    public Wallet save(Wallet wallet) {
        return walletRepository.save(wallet);
    }
}