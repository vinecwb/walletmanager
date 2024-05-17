package com.example.walletmanager.infra.repository;

import com.example.walletmanager.domain.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, String> {
}
