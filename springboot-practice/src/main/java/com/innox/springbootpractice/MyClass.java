package com.innox.springbootpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController  // handles HTTP requests

public class MyClass {

    @GetMapping("abc")//Maps HTTP GET request to the method

    public String sayHello(){
        return "Hello";
    }
}

//http://localhost:8080/abc


