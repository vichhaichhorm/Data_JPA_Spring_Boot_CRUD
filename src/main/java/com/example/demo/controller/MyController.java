package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/welcome/myCustomer")
    public String welcome(){
        return "Hello spring vichhai";
    }
    @GetMapping
    public void connect(){
        System.out.println ("Connect database successful");
    }

}
