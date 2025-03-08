package com.aliek.security6.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/myLoans")
    public String getLoanDetails(){
        return "My Loan Details";
    }
}
