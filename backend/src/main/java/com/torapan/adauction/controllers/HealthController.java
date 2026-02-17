package com.torapan.adauction.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "AdAuction is running 🚀";
    }

    @GetMapping("/ready")
    public String ready() {
        return "AdAuction is ready ✅";
    }

}
