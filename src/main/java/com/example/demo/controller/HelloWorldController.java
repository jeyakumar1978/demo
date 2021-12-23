package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello from Jey";
    }

    @RequestMapping("/helloworld")
    public String helloworld()
    {
        return "Helloworld from Jey";
    }
}
