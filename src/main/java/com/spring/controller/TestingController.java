package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080
@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class TestingController {


    // http://localhost:8080/api/name
    @GetMapping("/name")
    public String getName(){
        return "I am Eslam Khder";
    }

}
