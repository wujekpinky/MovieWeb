package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCtrl {

    @RequestMapping
    public String get(){
        return "Hello!";
    }
}
