package com.example.crud_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class AppController {

    @GetMapping("hello")
    public String index() {
        return "welcome to the API";
    }
}
