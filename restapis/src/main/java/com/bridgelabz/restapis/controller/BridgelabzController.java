package com.bridgelabz.restapis.controller;

import com.bridgelabz.restapis.entity.User;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/post")
    public String getName(@RequestBody User user){
        return "full name is :"+user.getFirstName()+" "+user.getLastName();
    }



}
