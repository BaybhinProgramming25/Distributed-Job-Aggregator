package com.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.core.Authentication;
import com.example.service.SubscribeService;

@RestController 
public class SubscribeController {

    private final SubscribeService subscribeService;

    public SubscribeController(SubscribeService subscribeService) {
        this.subscribeService = subscribeService;
    }

    @PostMapping("/api/subscribe")
    public void subscribe(Authentication authentication) {
        subscribeService.subscribeToCompanies(authentication.getName());
    }
}
