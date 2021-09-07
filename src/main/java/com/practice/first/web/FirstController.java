package com.practice.first.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping( "/hello")
    public String PrintHelloWorld(){
        return "hello";
    }
}
