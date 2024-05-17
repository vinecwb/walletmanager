package com.example.walletmanager.walletmanager;

import com.example.walletmanager.domain.entity.Wallet;
import com.example.walletmanager.domain.service.WalletService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/wallet")
@RequiredArgsConstructor
@Slf4j
public class WMController {

    private final WalletService walletService;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody Wallet wallet) {
        log.info("Transação recebida com sucesso: transação: {}, wallet: {}, person_id: {}, description: {}",
                wallet.getTransactionId(), wallet.getWalletId(), wallet.getPersonId(), wallet.getDescription());

        Wallet savedWallet = walletService.save(wallet);

        return ResponseEntity.ok("Transação salva com sucesso: " + savedWallet.getId());
    }
}