package com.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080
@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class TestingController {


    @Value("${admin.name}")
    private String name;

    // http://localhost:8080/api/name
    @GetMapping("/name")
    public String getName(){
        return "I am" + name;
    }

    // http://localhost:8080/api/age
    @GetMapping("/age")
    public String getAge(){
        return "21";
    }

    // http://localhost:8080/api/address
    @GetMapping("/address")
    public String getAddress() {
        return "Alex";
    }
}
