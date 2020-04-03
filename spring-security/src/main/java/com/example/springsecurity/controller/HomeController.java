package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String show(){
        return  ("<h1>HomeController from Spring-Security</h1>");
    }
    @GetMapping("/user")
    public String showUser(){
        return  ("<h1>HomeController from Spring-Security User</h1>");
    }
    @GetMapping("/admin")
    public String showAdmin(){
        return  ("<h1>HomeController from Spring-Security Admin</h1>");
    }
}
