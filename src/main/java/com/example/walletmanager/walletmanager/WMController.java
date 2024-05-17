package com.example.walletmanager.walletmanager;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WMController {

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody MyRequest myRequest) {
        return ResponseEntity.ok("Dados recebidos com sucesso!");
    }
}

class MyRequest {
    private String field1;
    private int field2;

    // Getters e Setters
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }
}