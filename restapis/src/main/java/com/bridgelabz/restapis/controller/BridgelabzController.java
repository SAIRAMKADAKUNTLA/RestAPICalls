package com.bridgelabz.restapis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BridgelabzController {

    @GetMapping("/hello")
    public String getMessage(){
        return  "Hello From Bridgelabz";
    }

    @GetMapping("/hello/{name}")
    public String getMessageWithName(@PathVariable("name")String name){
        return "Hello "+name+" From Bridgelabz";
    }

}
