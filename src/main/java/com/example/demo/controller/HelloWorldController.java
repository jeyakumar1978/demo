package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "Hello from Mervin Jose";
    }

    @RequestMapping("/helloworld")
    public String helloworld()
    {
        return "Helloworld from Mervin Jose";
    }
}
