package com.example.walletmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WalletmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletmanagerApplication.class, args);
	}

}
