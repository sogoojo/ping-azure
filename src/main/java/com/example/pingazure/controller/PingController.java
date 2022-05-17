package com.example.pingazure.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @GetMapping
    public String pinger(){
        return "Hello from spring boot";
    }
}
