package com.bridgelabz.restapis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BridgelabzController {

    @GetMapping("/hello")
    public String getMessage(){
        return  "Hello From Bridgelabz";
    }

}
