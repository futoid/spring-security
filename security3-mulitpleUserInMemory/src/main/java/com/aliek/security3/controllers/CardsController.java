package com.aliek.security3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/myCards")
    public String getCardDetails(){
        return "My Card Details";
    }
}
